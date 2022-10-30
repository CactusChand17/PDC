/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manu2
 */
public class Database {

    Connection connection = null;
    String url = "jdbc:derby://localhost:1527/BossFights;"; //url of database
    String dbusername = "pdc"; //username and password of database
    String dbpassword = "pdc";

    //checks if the user exist
    public void userExists(String username, String password, String age) {
        try {
            //sets playerData username to inputed username
            playerData playerData = new playerData();
            playerData.setUsername(username);
            //sets password and age
            playerData.setPassword(password);
            playerData.setAge(age);
            System.out.println(username + password + age);
            //in sql statement it looks at all variables from username
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT username, password, age, wins FROM UserSQL WHERE username = '" + username + "'");
            if (rs.next()) {
                //sets passwords string to password
                String passwords = rs.getString("password");
                System.out.println(passwords);
                //compares passwords variable to inputed password
                //if its true then the user exists
                if (password.compareTo(passwords) == 0) {
                    System.out.println("User exists");
                    playerData.setUsername(rs.getString("username"));
                    playerData.setWins(rs.getInt("wins"));
                    playerData.setAge(rs.getString("age"));
                }
                //else it creates another user
            } else {
                System.out.println("Creating new User");
                statement.executeUpdate("INSERT INTO UserSQL " + "VALUES('" + username + "', '" + password + "', '" + age + "', 0)");
                playerData.setUsername(username);
                playerData.setWins(0);
                playerData.setAge(age);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //sets up table
    public void setUp() {
        try {
            //creates new table from the database url, username and password
            connection = DriverManager.getConnection(url, dbusername, dbpassword);
            Statement statement = connection.createStatement();
            String newTable = "UserSQL";
            //if the table does not exist create another table
            if (!tableExists(newTable)) {
                System.out.println("Creating new table");
                statement.executeUpdate("Create Table " + newTable + " (username VARCHAR(12), password VARCHAR(12), age VARCHAR(12), wins INT)");
            }
            statement.close();
        } catch (Throwable e) {
            System.out.println(e);
        }
    }
    
    //checks if the table exists
    private boolean tableExists(String newTable) {
        boolean checker = false;
        try {
            //compares the table name as string to inputted table name
            //if true the it exists
            DatabaseMetaData dbmd = connection.getMetaData();
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null);
            while (rsDBMeta.next()) {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                if (tableName.compareToIgnoreCase(newTable) == 0) {
                    System.out.println(tableName + " exists");
                    checker = true;
                }
            }
            if (rsDBMeta != null) {
                rsDBMeta.close();
            }
        } catch (SQLException ex) {
        }
        return checker;
    }
    
    //saving stats to database
    public void saveStats(int wins, String username) {
        
        try {       
            //sets up connectiion
            connection = DriverManager.getConnection(url, dbusername, dbpassword);
            Statement statement = connection.createStatement();
            //updates the userSQL wins where the username is the inputted username
            statement.executeUpdate("UPDATE UserSQL SET wins=" + wins + " WHERE username='" + username + "'");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.util.ArrayList;

/**
 *
 * @author manu2
 */
public class BotNames {
    
    //two arraylists containing random names and addon names
    ArrayList<String> botNames = new ArrayList();
    ArrayList<String> botNamesAddOn = new ArrayList();
    
    //Name
    public ArrayList botNames()
    {
        botNames.add("Boss Bell");
        botNames.add("Twinkie");
        botNames.add("Apollo");
        botNames.add("Murcurry");
        botNames.add("Gizmo");
        botNames.add("Isolde");
        botNames.add("Opt");
        botNames.add("Mel'Veth");
        
        return botNames;
    }
    
    //Title
    public ArrayList botNamesAddOn()
    {
        botNames.add("The God Killer");
        botNames.add("The Fairy Queen");
        botNames.add("The Sun Demon");
        botNames.add("The Unkillable");
        botNames.add("The Timeless");
        botNames.add("The Elegent");
        botNames.add("The Void");
        botNames.add("The Unmoveable");
        
        return botNames;
    }
}

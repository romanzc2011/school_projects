/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */

package familypackage;


public class Family {
    private String[] members;
    
    public Family(String ... names) {
        members = names;
    }
    
    public String toString() {
        String result = "";
        
        for(String name : members) {
            result += name + "\n";
        }
        return result;
    }

}

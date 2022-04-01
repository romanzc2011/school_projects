/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */

package com.mycompany.testch7;


public class NewMain {

    
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "";
        
        
        for (int i = 0; i < 3; i++) {
           c = c.concat(a);
           c = c.concat(b);
        }
        System.out.println(c);
        
    }

}

/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */

package colorarrayexample;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        // Ctrl + Shift + i to fix imports
        // --- Creating array of type Color using initializer list
        Color[] csj = {
            new Color(122, 4, 3),
            new Color(229, 70, 11),
            new Color(250, 186, 57),
            new Color(163, 253, 61),
            new Color(26, 228, 182),
            new Color(70, 134, 250),
            new Color(48, 18, 59)
        };
        
        /*
        // --- Accomplishes the same thing as above, just more typing
        Color[] csj = new Color[7];
        csj[0] = new Color(122, 4, 3);
        csj[1] = new Color(229, 70, 11);
        csj[2] = new Color(250, 186, 57);
        csj[3] = new Color(163, 253, 61);
        csj[4] = new Color(26, 228, 182);
        csj[5] = new Color(70, 134, 250);
        csj[6] = new Color(48, 18, 59);
        */
        
        System.out.println(csj[0]);
        
        int count = 0;
        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);
            
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                
                String[] tokens = data.split(",");
                
                csj[count] = new Color(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), 
                                       Integer.parseInt(tokens[2]));
                count++;
            }
            
            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error reading input file.");
            e.printStackTrace();
        }
        
    }
        
    
        
}



/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */

package com.mycompany.lettercount;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        final int NUMCHARS = 26;
        Scanner scan = new Scanner(System.in);
        
        int[] upper = new int[NUMCHARS];
        int[] lower = new int[NUMCHARS];
        
        char current;
        int other = 0;
        
        System.out.println("Enter a sentence: ");
        String line = scan.nextLine();
        
        for(int ch = 0; ch <= line.length(); ch++){
            current = line.charAt(ch);
            if(current >= 'A' && current <= 'Z'){
                upper[current-'A']++;
            } else if(current => 'a' && current <= 'z'){
                lower[current - 'A']++;
            } else {
                other++;
            }
                
            
        }
    }
    
        
}

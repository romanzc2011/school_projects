/*
 * File: Main.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 2-1-2022
 * Java class description: This java file is the driver class for the MyString class.
 */

package com.mycompany.lab02_campbell_roman;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        
        
    //==============================================================================================
    //==============================================================================================
    //=====VARIABLES
    //==============================================================================================
    //==============================================================================================
    String strOne, strPart2_1, strPart2_2, strPart2_3, strPart3_1, strPart3_2, strPart3_3, 
      strPart3Final, strPart3Con1, strPart3Con2, strPart3Con3;
    int count, countPart2_1, countPart2_2, countPart2_3, countTotalP2, countPart3;
        
    
    //==============================================================================================
    //==============================================================================================
    //=====OBJECTS
    //==============================================================================================
    //==============================================================================================
    Scanner scan = new Scanner(System.in);
    
    
    //==============================================================================================
    //==============================================================================================
    //=====PART 1
    //==============================================================================================
    //==============================================================================================
    // Prompt user for string to be concatenated and how many times=================================
        
        System.out.println("PART 1: \n");
        System.out.println("Enter string to be concatenated: ");
        strOne = scan.nextLine();
        
        System.out.println("How many times to run the concatenation: ");
        count = scan.nextInt();
        
        // Call the multiConcat method--------------------------------------------------------------
        if (count <= 0) {
            
            MyString.multiConcat(strOne);
        } else if (count >= 1) {
            
            MyString.multiConcat(strOne, count);
        }
        
        System.out.println("-------------------------------------------------------------------\n");
        
        
    //==============================================================================================
    //==============================================================================================
    //=====PART 2
    //==============================================================================================
    //==============================================================================================
        System.out.println("PART 2: Concatenate three strings\n");
        
        System.out.println("Enter first string to be concatenated: ");
        scan.nextLine();
        strPart2_1 = scan.nextLine();
        System.out.println("How many times?");
        countPart2_1 = scan.nextInt();
        
        System.out.println("Enter second string to be concatenated: ");
        scan.nextLine();
        strPart2_2 = scan.nextLine();
        System.out.println("Number of times: ");
        countPart2_2 = scan.nextInt();
        
        System.out.println("Enter third string to be concatenated: ");
        scan.nextLine();
        strPart2_3 = scan.nextLine();
        System.out.println("Number of times: ");
        countPart2_3 = scan.nextInt();
        
        System.out.println("Number of times to concatenate all strings: ");
        countTotalP2 = scan.nextInt();
        
        MyString.multiConcat(strPart2_1, strPart2_2, strPart2_3, countPart2_1, countPart2_2, 
          countPart2_3, countTotalP2);
        
        System.out.println("-------------------------------------------------------------------\n");
        
        
    //==============================================================================================
    //==============================================================================================
    //=====PART 3
    //==============================================================================================
    //==============================================================================================
    // Prompt user for strings to be concatenated and how many times--------------------------------
        System.out.println("PART 3: Concatenate three strings:\n");
        System.out.println("Enter first string to be concatenated: ");
        scan.nextLine();
        strPart3_1 = scan.nextLine();
        System.out.println("Number of times: ");
        countPart3 = scan.nextInt();
        strPart3Con1 = MyString.concat(strPart3_1, countPart3);
        
        System.out.println("Enter second string to be concatenated: ");
        scan.nextLine();
        strPart3_2 = scan.nextLine();
        System.out.println("Number of times: ");
        countPart3 = scan.nextInt();
        strPart3Con2 = MyString.concat(strPart3_2, countPart3);
        
        System.out.println("Enter third string to be concatenated: ");
        scan.nextLine();
        strPart3_3 = scan.nextLine();
        System.out.println("Number of times: ");
        countPart3 = scan.nextInt();
        strPart3Con3 = MyString.concat(strPart3_3, countPart3);
        System.out.println("-------------------------------------------------------------------\n");
        
        strPart3Final = strPart3Con1 + strPart3Con2 + strPart3Con3;
        System.out.println("Number of times to concatenate final string: ");
        countPart3 = scan.nextInt();
        MyString.concat(strPart3Final, countPart3);
        
        
    }

}

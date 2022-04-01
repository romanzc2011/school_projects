/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */

package com.mycompany.arraypractice;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers[] = new int[5];
        int numOne, numTwo, prevOne, prevTwo;
        
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        System.out.println("Give two indices to swap: ");
        numOne = Integer.valueOf(scan.nextLine());
        numTwo = Integer.valueOf(scan.nextLine());
        System.out.println("\n");
        
        prevOne = numbers[numOne];
        prevTwo = numbers[numTwo];
        
        numbers[numOne] = prevTwo;
        numbers[numTwo] = prevOne;
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }
       
}



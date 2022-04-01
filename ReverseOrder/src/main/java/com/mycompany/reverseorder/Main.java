/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */

package com.mycompany.reverseorder;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10];
        
        System.out.println("The size of the array: " + numbers.length);
        
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            numbers[i] = scan.nextDouble();
        }
        
        System.out.println("\nNow in reverse: ");
        for(int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i] + " ");
        }
        
        System.out.println("\nNow with foreach");
        for(double num : numbers) {
            System.out.println(num + " ");
        }
        
    }

}

/*
 * File: Main.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 3/31/2022
 * Java class description: This is the driver class of MyArray that will call the static methods for 
   the creation and management of multidimensional arrays
 */

package csc145exam2;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minNum, maxNum, rows, columns;
        boolean mode;
        
        System.out.println("How many rows for array?:");
        rows = scan.nextInt();
        
        System.out.println("How many columns for array?:");
        columns = scan.nextInt();
        
        System.out.println("Enter the minimum number for the array:");
        minNum = scan.nextInt();
        
        System.out.println("Enter the maximum number for the array:");
        maxNum = scan.nextInt();
        
        System.out.println("Run in true or false mode?");
        mode = scan.nextBoolean();
        
        
        
        System.out.println();
        int[][] arr1 = MyArray.getArray2D(rows, columns, minNum, maxNum);
        
        System.out.println(MyArray.getString(arr1, mode, "[", "]", "(",
          ")"));
    }

}

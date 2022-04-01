/*
 * File: MyArray.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 3/31/2022
 * Java class description: This class will provide the driver class with several static methods that
   will create and handle multidimensional arrays
 */
package csc145exam2;

import java.util.Random;
public class MyArray {

    
    //==============================================================================================
    //==============================================================================================
    //========= METHODS
    //==============================================================================================
    //==============================================================================================
    public static int[][] getArray2D(int rows, int columns, int minNum, int maxNum){
        int[][] table = new int[rows][columns];
        Random rand = new Random();
        int randNum;
        
        // Create 2D array via for loop thru rows and columns ---
        for(int row = 0; row < table.length; row++){
            for(int col = 0; col < table[row].length; col++){
                randNum = rand.nextInt(maxNum - minNum + 1) + minNum;
                table[row][col] = randNum;
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }
        return table;
    }
    
    public static String getString(int[][] array, boolean mode, String delimiterLeft1, String 
      delimiterRight1, String delimiterLeft2, String delimiterRight2){
        String strArr = "";
        // Determine if mode is set to true if so use delimiter 1 ---
        if(mode == true){
            for(int row = 0; row < array.length; row++){
                for(int col = 0; col < array[row].length; col++){
                    if(col % 2 == 0 && row % 2 == 0){
                        strArr += delimiterLeft1 + array[row][col] + delimiterRight1;
                    } else if(col % 2 != 0 && row % 2 != 0){
                        strArr += delimiterLeft1 + array[row][col] + delimiterRight1;
                    } else {
                        strArr += delimiterLeft2 + array[row][col] + delimiterRight2;
                    }
                }
                strArr += "\n";
            }
        }
        
        // Determine if mode is set to false if so use delimiter 2 ---
        if(mode == false){
            for(int row = 0; row < array.length; row++){
                for(int col = 0; col < array[row].length; col++){
                    if(col % 2 == 0 && row % 2 == 0){
                        strArr += delimiterLeft2 + array[row][col] + delimiterRight2;
                    } else if(col % 2 != 0 && row % 2 != 0){
                        strArr += delimiterLeft2 + array[row][col] + delimiterRight2;
                    } else {
                        strArr += delimiterLeft1 + array[row][col] + delimiterRight1;
                    }
                }
                strArr += "\n";
            }
        }
        return strArr;
        
    }

}

/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */

import java.util.Random;
public class ArrayUtility {
    
    public static int [] getArrayInt(int minNum, int maxNum, int size){
        Random rand = new Random();
        int[] arr1 = new int[size];
        int range = maxNum - minNum + 1;
        
        for(int rows = 0; rows < arr1.length; rows++){
            arr1[rows] = rand.nextInt(range);
        }
        return arr1;
    }
    
    public static int[][] get2DArrayInt(int minNum, int maxNum, int rows, int cols){
        int[][] arr2 = new int[rows][cols];
        
        for(int row = 0; row < arr2.length; row++){
            arr2[row] = getArrayInt(minNum, maxNum, row);
        }
        return arr2;
    }

}


import java.util.Random;

/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */
import java.util.Random;

public class MyArrayUtility {
    public static int[] getArrayInt(int maxVal, int numVal) {
        
        // Returns an array of random int values
        return getArrayInt(0, maxVal, numVal);
    }
    
    public static int[] get2DArrayInt(int maxVal, int numRows, int numColumns) {

    // Returns an array of random int values
    return getArrayInt(0, maxVal, numRows, numColumns);
}
    
    public static int[] getArrayInt(int minVal, int maxVal, int numVal) {
        // Creates an array of int values
        int[] a = new int[numVal];
        
       
        Random r = new Random();
        
        // --- Calculate the randge of values
        int range = maxVal - minVal +1;
        
        
        // Populates that array with random numbers between 0 and maxVal
        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(range + minVal);
        }
        
        // Returns an array of random int values
        return a;
    }
    
    public static int[] get2DArrayInt(int minVal, int maxVal, int numRows, int numColumns) {
        // Creates an array of int values
        int[][] a = new int[numRows][numColumns];
       
        Random r = new Random();
        
        // --- Calculate the randge of values
        int range = maxVal - minVal +1;
        
        // Populates that array with random numbers between 0 and maxVal
        for(int row = 0; row < a.length; row++) {
            a[row] = get2DArrayIn
        }
        
        // Returns an array of random int values
        return a;
    }
    
    public static String arrayInt2String(int[] array, String leftDelim, String rightDelim) {
        String s = "";
        
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1 && leftDelim.length() == 0) {
                s += array[i];
                
            } else {
              s += leftDelim + array[i] + rightDelim;  
            }
        }
        
        return s;
    }

}

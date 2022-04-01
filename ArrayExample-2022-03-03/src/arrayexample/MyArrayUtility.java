package arrayexample;

import java.util.Random;

/**
 *
 * @author mtrutsch
 */
public class MyArrayUtility {

  /**
   * Returns numVal random numbers between 0 and maxVal, inclusive.
   * @param maxVal
   * @param numVal
   * @return
   */
  public static int[] getArrayInt(int maxVal, int numVal) {
    // --- Raturns an array of random int values
    return getArrayInt(0, maxVal, numVal);
  }  

  public static int[][] get2DArrayInt(int maxVal, int numRows, int numCols) {
  // --- Raturns an array of random int values
  return get2DArrayInt(0, maxVal, numRows, numCols);
}  

  
  
  /**
   * Returns numVal random numbers between minVal and maxVal, inclusive.
   * @param minVal Minimum value, inclusive
   * @param maxVal Maximum value, inclusive
   * @param numVal Number of values (array length)
   * @return Array of random values.
   */
  public static int[] getArrayInt(int minVal, int maxVal, int numVal) {
    // --- Creates an array of int values
    int[] a = new int[numVal];

    // --- Creates an object of type Random    
    Random r = new Random();
     
    // --- Calculates the range of values
    int range = maxVal - minVal + 1;
    
    // --- Populates the array with random numbers between 0 and maxVal
    for(int i = 0; i < a.length; i++) {
      a[i] = r.nextInt(range) + minVal;
    }
    
    // --- Raturns an array of random int values
    return a;
  }  
    
  /**
   * Returns numVal random numbers between minVal and maxVal, inclusive.
   * @param minVal Minimum value, inclusive
   * @param maxVal Maximum value, inclusive
   * @param numVal Number of values (array length)
   * @return Array of random values.
   */
  public static int[][] get2DArrayInt(int minVal, int maxVal, int numRows, int numCols) {
    // --- Creates an array of int values
    int[][] a = new int[numRows][numCols];

    // --- Populates the array with random numbers between 0 and maxVal
    for(int row = 0; row < a.length; row++) {
      a[row] = getArrayInt(minVal, maxVal, numCols);
    }
    
    // --- Raturns an array of random int values
    return a;
  }  

  /**
   * Converts a one-dimensional array of integers to a String.
   * @param array
   * @param lDelim
   * @param rDelim
   * @return A string representation of a one-dimensional array
   */
  public static String arrayInt2String(int[] array, String lDelim, String rDelim) {
    String s = "";
    
    for(int i = 0; i < array.length; i++) {
      if(i == array.length - 1 && lDelim.length() == 0) {
        s += array[i];
      } else {
        s += lDelim + array[i] + rDelim;        
      }
    }
    
    return s;
  }

  /**
   * Converts a two-dimensional array of integers to a String.
   * @param array
   * @param lDelim
   * @param rDelim
   * @return A string representation of a two-dimensional array
   */
  public static String array2DInt2String(int[][] array, String lDelim, String rDelim) {
    String s = "";
    
    for(int row = 0; row < array.length; row++) {
      s += arrayInt2String(array[row], lDelim, rDelim) + "\n";
    }
    
    return s;
  }
  
  public static int[] getColumn(int [][] array, int columnNum) {
      int[] a = new int[array.length];
      
      for(int row = 0; row < array.length; row++) {
          if(array[row].length > columnNum) {
              a[row] = array[row][columnNum];
          } else {
              a[row] = -Integer.MAX_VALUE;
          }
      }
      
      return a;
      
  }
}

package arrayexample;

/**
 *
 * @author mtrutsch
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // ----- Example 1
    System.out.println("\n=== Example 1");

    // ---  0  1  2  3  4  5  6  7  8  9
    // --- [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
    int[] a = new int[10];
    
    a[5] = 7;
    
    for(int i = 0; i < a.length; i++) {
      a[i] = i;
      System.out.println("a[" + i + "]: " + a[i]); 
    }
    
    // ----- Example 2
    System.out.println("\n=== Example 2");
    String[] s = new String[5];
    
    s[3] = "Bob";
    s[1] = "Susan";
    
    for(int i = 0; i < s.length; i++) {
      System.out.println("s[" + i + "]: " + s[i]);
      if(s[i] != null) {
        System.out.println("\tLength: " + s[i].length());
      }
    }
    
    // ----- Example 3
    System.out.println("\n=== Example 3");
    int[] a2 = MyArrayUtility.getArrayInt(12, 7);

    for(int i = 0; i < a2.length; i++) {
      System.out.println("a2[" + i + "]: " + a2[i]); 
    }
    
    System.out.println(MyArrayUtility.arrayInt2String(a2, "[", "]"));
    System.out.println(MyArrayUtility.arrayInt2String(a2, "<", ">"));
    System.out.println(MyArrayUtility.arrayInt2String(a2, "", ","));
    //System.out.println(MyArrayUtility.arrayInt2String(a2, null, ","));

    // ----- Example 4
    System.out.println("\n=== Example 4");
    int[][] a3 = MyArrayUtility.get2DArrayInt(9, 4, 6);
    System.out.println(MyArrayUtility.array2DInt2String(a3, "[", "]"));
    
    // ----- Example 5
    System.out.println("\n=== Example 5");
    int[] myColumn = MyArrayUtility.getColumn(a3, 2);
    System.out.println(MyArrayUtility.arrayInt2String(myColumn, "[", "]"));
    
   
  } 
  
}

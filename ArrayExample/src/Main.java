/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */


public class Main {

    
    public static void main(String[] args) {
        // --- [][][][][][][][][][]
        System.out.println(" ==== Example 1");
        int[] a = new int[10];
        
        a[5] = 7;
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]" + a[i]);
        }
        
        // --- Example 2
        System.out.println("\n==== Example 2");
        String [] s = new String[5];
        
        s[0] = "Roman";
        s[3] = "Ryder";
        s[1] = "Go";
        
        for (int i = 0; i < s.length; i++) {
            System.out.println("s[" + i + "]" + s[i]);
            if(s[i] != null) {
                System.out.println("\tLength: " + s[i].length());
            }
        }
        
        // --- Example 3
        System.out.println("\n==== Example 3");
        int[] a2 = MyArrayUtility.getArrayInt(12, 7);
        for (int i = 0; i < a2.length; i++) {
            System.out.println("a2[" + i + "]" + a2[i]);
        }
        
        System.out.println(MyArrayUtility.arrayInt2String(a2, "[", "]"));
        System.out.println(MyArrayUtility.arrayInt2String(a2, "[", ">"));
        System.out.println(MyArrayUtility.arrayInt2String(a2, "<", ">"));
        System.out.println(MyArrayUtility.arrayInt2String(a2, "", ","));
    }

}

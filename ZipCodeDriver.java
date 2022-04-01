/* Name: Roman Campbell
 * Course: CSC 135
 * Project: FinalProject
 * File name: ZipCodeDriver.java
 */

/*
  This program will prompt the user for a zipcode. Tall bars are represented by
  | and small bars are represented by :. Each digit of zip code is encoded by 
  values of 7, 4, 2, 1. Each digit is always represented by 2 tall and 3 short
  bars.
*/

import java.util.Scanner;
public class ZipCodeDriver {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strZip;
        
        System.out.println("Enter your Zip Code (i.e. 71107-1234): ");
        strZip = scan.next();
        
        // Ensure a valid zip code has been entered-----------------------------
        while (strZip.length() != 10) {
            System.out.println("You entered an invalid Zip Code, please "
                    + "re-enter your Zip Code (i.e. 71104-1234)");
            strZip = scan.next();
        }
        
        ZipCode zipCode = new ZipCode(strZip);
        System.out.println(strZip);
    
    }

}

/*
 * File: MyString.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 1/28/2022
 * Java class description: This class will define the two classes required for the Main driver class 
   to operate according to specifications. It will implement two overloaded methods called 
   multiConcat. multiConcat will take a String and integer as parameters, i.e. if string=hi and 
   int=4, method will print hihihihi. If int parameter is < 2 original String is returned. The 
   overloaded multiConcat will return the string concatenated with itself if no int is passed, 
   i.e. if String=test, then return "testtest." This class will also implement another multiConcat 
   method that will take 3 strings and 3 ints showing how many times each string will be concat, the
   single int will determine how many times to return the strings.
 */

package com.mycompany.lab02_campbell_roman;

import java.util.Scanner;
public class MyString {
    
    
    //==============================================================================================
    //==============================================================================================
    //=====VARIABLES
    //==============================================================================================
    //==============================================================================================
    Scanner scan = new Scanner(System.in);
    
    //==============================================================================================
    //==============================================================================================
    //=====CONSTRUCTORS
    //==============================================================================================
    //==============================================================================================
    public MyString() {
        
    }
    
    
    //==============================================================================================
    //==============================================================================================
    //=====METHODS
    //==============================================================================================
    //==============================================================================================
    public static String multiConcat(String strOne, int countOne) {
        String strResult = "";
        
        for (int i = 0; i < countOne; i++) {
            
            strResult = strResult + strOne;
            
        }
        System.out.println(strResult);
        return strResult;
    }
    
    // First overloaded method that concats itself if no int is provided in parameters--------------
    public static String multiConcat(String strOne) {
        strOne = strOne + strOne;
        
        System.out.println(strOne);
        return strOne;
    }
    
    // Second overloaded method takes 3 str and number times to be concat---------------------------
    public static String multiConcat(String strOne, String strTwo, String strThree, int numOne,
      int numTwo, int numThree, int count) {
        String strSec1, strSec2, strSec3;
        String strResult = "";
        strSec1 = "";
        strSec2 = "";
        strSec3 = "";
        
        // for loop to concat strSec1, numOne times-------------------------------------------------
        for (int i = 0; i < numOne; i++) {
            strSec1 = strSec1 + strOne;
        }
        
        // for loop to concat strSec2, numTwo times-------------------------------------------------
        for (int i = 0; i < numTwo; i++) {
            strSec2 = strSec2 + strTwo;
        }
        
        // for loop to concat strSec3, numThree times-----------------------------------------------
        for (int i = 0; i < numThree; i++) {
            strSec3 = strSec3 + strThree;
        }
        
        // for loop to combine all concat strings into one------------------------------------------
        for (int i = 0; i < count; i++) {
        
            strResult = strResult + strSec1;
            strResult = strResult + strSec2 ;
            strResult = strResult + strSec3;
        }
        System.out.println(strResult);
        return strResult;
    }
    
    public static String concat(String str, int count) {
        String strResult = "";
        
        for (int i = 0; i < count; i++) {
            strResult = strResult + str;
        }
        System.out.println(strResult);
        return strResult;
    }
}

package com.mycompany.ex_7_1;

import java.util.Scanner;
public class MyMath {
    //==========================================================================
    //==========================================================================
    //============CONSTRUCTOR===================================================
    //==========================================================================
    //==========================================================================
    public MyMath() {
        
    }
    
    
    //==========================================================================
    //==========================================================================
    //============PUBLIC METHODS================================================
    //==========================================================================
    //==========================================================================

    /**
     * EX 7.1 Calculates average of two integer values
     * @param num1 Numbeer 1
     * @param num2 Number 2
     * @return The average of two integers
     */
    public float average(int num1, int num2) {
        float avg = (num1 + num2) / 2.0f;
        
        return avg;
    }
    
   /**
     * EX 7.2 Calculates average of three integer values
     * @param num1 Numbeer 1
     * @param num2 Number 2
     * @param num3 Number 3
     * @return The average of three integer values
     */
    public float average(int num1, int num2, int num3) {
        float avg = (num1 + num2 + num3) / 3.0f;
        
        return avg;
    }
    
    public float average(int num1, int num2, int num3, int num4) {
        float avg = (num1 + num2 + num3 + num4) / 4.0f;
        
        return avg;
    }
}

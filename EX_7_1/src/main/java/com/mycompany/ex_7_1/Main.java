package com.mycompany.ex_7_1;


public class Main {

    
    public static void main(String[] args) {
        
        MyMath mm = new MyMath();
        
        int num1 = 5;
        int num2 = 2;
        float average = mm.average(num1, num2);
        
        System.out.println("The average of " + num1 + " and " + num2 + " is " 
          + average);
    }

}

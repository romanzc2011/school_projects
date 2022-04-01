/*
 * File: MyEllipse.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 2/26/2022
 * Java class description: This class creates MyEllipse object to do perimeter and area
   calculations for the driver class Main.
 */


public class MyEllipse implements Calculable {
    private double sideA, sideB;
    
    
    //==============================================================================================
    //==============================================================================================
    //========CONSTRUCTORS
    //==============================================================================================
    //==============================================================================================
    public MyEllipse(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        
    }
    
    
    //==============================================================================================
    //==============================================================================================
    //========METHODS
    //==============================================================================================
    //==============================================================================================
    
    
    public double getSideA() {
        return sideA;
    }
    
    public double getSideB() {
        return sideB;
    }
    
    public double getArea() {
        return Math.PI * sideA * sideB;
    }
    
    public double getPerimeter() {
        double squareRootSides;
        
        squareRootSides = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)) / 
          2);
        return 2 * Math.PI * squareRootSides;
    }
    
    public String toString() {
        String result = "";
        
        result += "Roman Campbell, CSC Concentration: Cybersecurity and Networking";
        result += "Rectangle\n";
        result += "\tSide A: " + getSideA()+ " units\n";
        result += "\tSide B: " + getSideB() + " units\n";
        result += "\tArea: " + getArea() + " square units\n";
        result += "\tPerimeter: " + getPerimeter() + " units";
        
        return result;
    }

}

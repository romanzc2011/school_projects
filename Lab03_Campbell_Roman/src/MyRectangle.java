/*
 * File: MyRectangle.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 2/24/2022
 * Java class description: This class creates MyRectangle object to do perimeter and area
   calculations for the driver class Main.
 */


public class MyRectangle implements Calculable {
    private double width, height;
    
    
    //==============================================================================================
    //==============================================================================================
    //========CONSTRUCTORS
    //==============================================================================================
    //==============================================================================================
    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    
    //==============================================================================================
    //==============================================================================================
    //========METHODS
    //==============================================================================================
    //==============================================================================================
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }
    
    public double getArea() {
        return width * height;
    }
    
    // toString method to display the first 3 rows of the example output on moodle page
    @Override
    public String toString() {
        String result = "";
        
        result += "Roman Campbell, CSC Concentration: Cybersecurity and Networking\n";
        result += "Rectangle\n";
        result += "\tWidth: " + getWidth() + " units\n";
        result += "\tHeight: " + getHeight() + " units\n";
        result += "\tArea: " + getArea() + " square units\n";
        result += "\tPerimeter: " + getPerimeter() + " units";
        
        return result;
    }

}

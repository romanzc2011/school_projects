/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */

package interfacetriangle;


public abstract class MyTriangle implements MyComparable {
    private double perimeter;
    private int sideOne, sideTwo, sideThree, base, height;
    
    
    public MyTriangle(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
    
    public double getArea() {
        return base * height / 2;
    }
    
    public boolean isLarger(MyComparable obj1, MyComparable obj2) {
        return (obj1.getValue() > obj2.getValue());
    }
    
    public double getValue() {
        return (double) getArea();
    }
    
    public int compareTo(MyComparable obj1, MyComparable obj2) {
        int result = 0;
        
        // --- obj1 > obj2 ... -1
        // --- obj2 > obj1 ...  1
        // --- obj1 = obj2 ...  0 (set as a default value above
        if (obj1.getValue() > obj2.getValue()) {
            result = -1;
        } else if (obj2.getValue() > obj1.getValue()) {
            result = 1;
        } else if (obj1 == obj2) {
            result = 0;
        }
        return result;
    }

}

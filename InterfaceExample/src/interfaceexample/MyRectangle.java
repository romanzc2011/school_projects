package interfaceexample;

/*
 * File: MyRectangle.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 2/24/2022
 * Java class description:
 */


public class MyRectangle implements MyComparable {
private float width = -Float.MAX_VALUE;
private float height = -Float.MAX_VALUE;
    
    public MyRectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    
    public float getWidth() {
        return width;
    }
    
    public float getHeight() {
        return height;
    }
    
    public float getArea() {
        return width * height;
    }
    
    //public static double getArea(float width) {
      //  return Math.PI * Math.pow(width, 2);
    //}
    
    public float getPerimeter() {
        return (2 * width) + (2 * height);
    }

    /**
     * Checks whether obj1 is greater than obj2
     * @param obj1 Object 1
     * @param obj2 Object 2
     * @return Boolean value indicating whether obj1 is greater than obj2 or not
     */
    @Override
    public boolean isLarger(MyComparable obj1, MyComparable obj2) {
        return (obj1.getValue() > obj2.getValue());
    }

    @Override
    public int compareTo(MyComparable obj1, MyComparable obj2) {
        int result = 0;
        
        // --- obj1 > obj2 ... -1
        // --- obj2 > obj1 ...  1
        // --- obj1 = obj2 ...  0 (set as a default value above
        if (obj1.getValue() > obj2.getValue()) {
            result = -1;
        } else if (obj2.getValue() > obj1.getValue()) {
            result = 1;
        } else if (obj1.getValue() == obj2.getValue()) {
            result = 0;
        }
        return result;
    }

    @Override
    public float getValue() {
        return (float) getArea();
    }

}

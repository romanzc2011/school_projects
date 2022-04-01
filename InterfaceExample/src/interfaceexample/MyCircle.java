package interfaceexample;


public class MyCircle implements MyComparable {
    private float radius;
    
    public MyCircle(float radius) {
        this.radius = radius;
    }
    
    public float getRadius() {
        return radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    //public static double getArea(float radius) {
      //  return Math.PI * Math.pow(radius, 2);
    //}
    
    public double getCircumference() {
        return 2 * Math.PI * radius;
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

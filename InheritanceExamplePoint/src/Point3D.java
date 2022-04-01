
import java.awt.Point;

/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */


public class Point3D extends Point {
    private int z;
    
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public int getZ() {
        return z;
    }
    
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }
    
    public double distance(Point3D p) {
        return Math.sqrt(Math.pow(x - p.x,2)) +
               Math.sqrt(Math.pow(y - p.y,2)) +
               Math.sqrt(Math.pow(z - p.z,2));
    }
    
    public String toString() {
        return "[" + x + "," + y + "," + z + "]";
    }

}

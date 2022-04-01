
import java.awt.Color;

/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */


public class Point4D extends Point3D {
    Color c = null;
    public Point4D(int x, int y, int z, Color c) {
        super(x, y, z);
        this.c = c;
        
    }
    
    public Color getColor() {
        return c;
    }
    
    public void setLocation(int x, int y, int z) {
        super.distance(x, y, z);
    }
    
    public double distance(Point4D p) {
        return super.distance(new Point3D(p.x, p.y, p.z));
    }

}

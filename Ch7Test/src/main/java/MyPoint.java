
import java.awt.Point;

/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */


public class MyPoint {

    
    public static void main(String[] args) {
        Point p = new Point();
        
        System.out.println(p.x); //0
        System.out.println(p.y); //0
        
        Point p2 = new Point(5, 10);
        System.out.println(p2.x); // 5
        System.out.println(p2.y); // 10
        
        p2.translate(2, -3);
        System.out.println(p2.x + "," + p2.y); // 7.7
        
    }

}

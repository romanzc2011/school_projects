/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */


public class Main {

    
    public static void main(String[] args) {
        Point3D p1 = new Point3D(2, 2, 2);
        Point3D p2 = new Point3D(2, 2, 10);
        double d = p1.distance(p2);
        System.out.println("The distance between " + p1 + " and " + p2 + " is: " + d);
    }

}

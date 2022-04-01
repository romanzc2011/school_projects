/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */


public class Main {

    
    public static void main(String[] args) {
        
        MyStatistics ms = new MyStatistics();
        System.out.println("Average: " + ms.getAverage(1, 2, 3, 4, 7));
        
        double result = MyStatistics.getAverage(2, 4, 6, 8, 10);
        System.out.println("Average (static): " + result);
        
        System.out.println("The result from above is: " + result);
    }

}

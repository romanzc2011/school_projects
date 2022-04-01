/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */


public class Main {
    
    public static void main(String[] args) {
        double mean1;
        
        mean1 = average(22,56,87,34,23);
        System.out.println(mean1);
        
        
        
    }
    
    public static double average(int ... list){
        double result = 0.0;
        
        if(list.length != 0){
            int sum = 0;
            for(int num : list){
                sum += num;
            }
            result = (double)sum / list.length;
        }
        return result;
    }

}

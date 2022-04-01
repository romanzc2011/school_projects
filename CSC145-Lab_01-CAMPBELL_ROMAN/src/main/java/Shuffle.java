/*
 * File: Shuffle.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 1/11/2021
 * Java class description: This class will create an Integer type ArrayList. It
   will create 12 random numbers between 10 and 50. It will create and add these
   numbers to ArrayList thru the use of a loop. The loop will also print out the
   number that is created as the loop is executed. A method will also be created
   that will create a random arraylist of numbers and then a different loop will
   randomly select indices from the arraylist, add them to the new arraylist,
   and delete from the original
 */

import java.util.ArrayList;
import java.util.Random;

public class Shuffle {
    
    public static void main(String[] args) {
        
        
        //======================================================================
        //======================================================================
        //============OBJECTS===================================================
        //======================================================================
        //======================================================================
        ArrayList<Integer> numArrayList = new ArrayList<Integer>();
        ArrayList<Integer> orderlyArrayList = new ArrayList<Integer>();
        ArrayList<Integer> regArrayList = new ArrayList<Integer>();
        ArrayList<Integer> randArrayList = new ArrayList<Integer>();
        Random rand = new Random();


        //======================================================================
        //======================================================================
        //============VARIABLES=================================================
        //======================================================================
        //======================================================================
        // Create lineNum for easier reading of elements of array---------------
        int lineNum = 1;
        int randomNum;
        int numHolder;
        int loopRandNum;
        int regSize;

        
        //======================================================================
        //======================================================================
        //============PART 5--loop to print 12 random nums betweent 10-50=======
        //======================================================================
        //======================================================================
        System.out.println("\nPart 5. Create an ArrayList of twelve Random "
                + "Numbers between 10 and 50: ");

        for (int i = 0; i < 12; i++) {
            int randNum = rand.nextInt(41) + 10;
            numArrayList.add(i, randNum);

        }
        System.out.println("...ArrayList created successfully...");

        // Get numArrayList size for future calculations------------------------
        int arrSize = numArrayList.size();
        int deleteTenNum = numArrayList.size() - 2;


        //======================================================================
        //======================================================================
        //============PART 6--print values from numArrayList====================
        //======================================================================
        //======================================================================
        System.out.println("\nPart 6. Print the Values in the ArrayList: ");
        lineNum = 1;

        for (int i=0; i < arrSize; i++) {
            System.out.println(lineNum + ". " + numArrayList.get(i));
            lineNum++;

        }
        
        
        //======================================================================
        //======================================================================
        //============PART 7--remove 10 random numbers from numArrayList========
        //======================================================================
        //======================================================================
        System.out.println("\nPart 7. Remove ten values in random order: ");
        System.out.println("Starting ArrayList numbers: " + numArrayList
                + " ArrayList size: " + numArrayList.size());

        for (int i=0; i < deleteTenNum; i++) {
            randomNum = rand.nextInt(numArrayList.size());
            regArrayList.add(i, numArrayList.get(randomNum));
            System.out.print("Deleting: " + numArrayList.get(randomNum));
            numArrayList.remove(randomNum);
            System.out.println(", numbers: " + numArrayList + " remain, "
                    + "ArrayList size: " + numArrayList.size());

        }

        // Add remaining values from numArrayList to regArrayList---------------
        for (int i = 0; i < numArrayList.size(); i++) {
            regArrayList.add(i, numArrayList.get(i));
        }
        // Get regArrayList size for future calculations------------------------
        regSize = regArrayList.size();


        //======================================================================
        //======================================================================
        //============PART 8--Create ArrayList with num 1-12 in numerical order=
        //======================================================================
        //======================================================================
        lineNum = 1;
        System.out.println("\nPart 8. Print in order numbers 1-12: ");
        for (int i=0; i < arrSize; i++) {
            orderlyArrayList.add(i + 1);
            System.out.println(lineNum + ". " + orderlyArrayList.get(i));
            lineNum++;

        }


        //======================================================================
        //======================================================================
        //============PART 9--Create random ArrayList using values from original
        //======================================================================
        //======================================================================
        System.out.println("\nPart 9. Create random ArrayList using values"
          + " from original ArrayList: ");
        lineNum = 1;
        for (int i = 0; i < regSize; i++) {
            loopRandNum = rand.nextInt(regArrayList.size());
            numHolder = regArrayList.get(loopRandNum);
            regArrayList.remove(loopRandNum);
            randArrayList.add(i, numHolder);
            System.out.println(lineNum + ". " + randArrayList.get(i));
            lineNum++;

        }
        
        System.out.println("Size of new ArrayList: " + randArrayList.size());

    }

}

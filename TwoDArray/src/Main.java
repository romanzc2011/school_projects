
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.plaf.TableUI;

/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */

import java.util.Random;
import java.util.Scanner;
import java.util.function.IntFunction;
import javax.imageio.metadata.IIOMetadataFormat;
public class Main {

    
    public static void main(String[] args) {
        try {
            File myFile = new File("src/test2.txt");
            Scanner myReader = new Scanner(myFile);
            List<String> lineNum = new ArrayList<String>();
            
            while(myReader.hasNextLine()){
                lineNum.add(myReader.nextLine());
            }
            
            String[] numbers = lineNum.toArray(new String[0]);
            
            for(int i = 0; i < numbers.length; i++){
                System.out.println(numbers[i]);
            }
            
        } catch(FileNotFoundException e){
            System.out.println("Error loading file");
            e.printStackTrace();
        }
        
    }
    
}

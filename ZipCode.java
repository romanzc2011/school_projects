/* Name: Roman Campbell
 * Course: CSC 135
 * Project: FinalProject
 * File name: ZipCode.java
 */

/* 
  This class is a template for the driver class so many instances of ZipCode
  can be instantiated if needed.
*/
public class ZipCode {
    
    private double zipCodeSum, correctDigit, roundUpInt;
    private String zipCodeString,frameString,zipDash,correctionCheck,zipCode;
    private StringBuilder barCodeBuilder;
    
    
    // Constructor for ZipCode--------------------------------------------------
    public ZipCode(String zipCodeString) {
        
        this.zipCodeString = zipCodeString;
        
        // StringBuilder for barcode--------------------------------------------
        barCodeBuilder = new StringBuilder();
        // Take dash out of Zip Code for processing-----------------------------
        zipCodeString = zipCodeString.substring(0, 5) + 
                zipCodeString.substring(6, 10);
        zipDash = zipCodeString.substring(5, 6);
        
        // Loop thru the zipCodeString and determined what char is assigned-----
        for (int i=0; i < zipCodeString.length(); i++) {
            
            // Evaluate each position to determine correct bar representation---
            switch (zipCodeString.charAt(i)) {
               
                case '1':
                   barCodeBuilder.append(":::||");
                   zipCodeSum += 1;
                   break;
                case '2':
                   barCodeBuilder.append("::|:|");
                   zipCodeSum += 2;
                   break;
                case '3':
                   barCodeBuilder.append("::||:");
                   zipCodeSum += 3;
                   break;
                case '4':
                   barCodeBuilder.append(":|::|");
                   zipCodeSum += 4;
                   break;
                case '5':
                   barCodeBuilder.append(":||::");
                   zipCodeSum += 5;
                   break;
                case '6':
                   barCodeBuilder.append(":||::");
                   zipCodeSum += 6;
                   break;
                case '7':
                   barCodeBuilder.append("|:::|");
                   zipCodeSum += 7;
                   break;
                case '8':
                   barCodeBuilder.append("|::|:");
                   zipCodeSum += 8;
                   break;
                case '9':
                   barCodeBuilder.append("|:|::");
                   zipCodeSum += 9;
                   break;
                case '0':
                   barCodeBuilder.append("||:::");
                   zipCodeSum += 0;
                   break;
           }
        
        }
        
        // Compute what digit is rounded up, then subtract zipCodeSum from it---
        roundUpInt = (Math.round(zipCodeSum / 10) * 10);
        
        // Check if the correction char will be set to 0------------------------
        if (zipCodeSum % 10 == 0) {
            correctDigit = 0;
        } else {
            correctDigit = roundUpInt - zipCodeSum;

        }
        
        //Turn correctDigit to str to add it to end of barcode------------------
        correctionCheck = Double.toString(correctDigit);
        // Check which barcode is applied to correctionCheck--------------------
        switch (correctionCheck.charAt(0)) {
            case '1':
                   barCodeBuilder.append(":::||");
                   break;
                case '2':
                   barCodeBuilder.append("::|:|");
                   break;
                case '3':
                   barCodeBuilder.append("::||:");
                   break;
                case '4':
                   barCodeBuilder.append(":|::|");
                   break;
                case '5':
                   barCodeBuilder.append(":||::");
                   break;
                case '6':
                   barCodeBuilder.append(":||::");
                   break;
                case '7':
                   barCodeBuilder.append("|:::|");
                   break;
                case '8':
                   barCodeBuilder.append("|::|:");
                   break;
                case '9':
                   barCodeBuilder.append("|:|::");
                   break;
                case '0':
                   barCodeBuilder.append("||:::");
                   break;
            
        }
        
        //Adding frame marker to beginning and end of barcode-------------------
        frameString = "|";
        barCodeBuilder.insert(0, frameString);
        barCodeBuilder.insert(51, frameString);

        System.out.println(barCodeBuilder);
        System.out.println(barCodeBuilder.length());
        System.out.println(zipCodeSum);
        System.out.println(correctDigit);
    
    }
    
    // Default constructor------------------------------------------------------
    public ZipCode() {
        
    }

}

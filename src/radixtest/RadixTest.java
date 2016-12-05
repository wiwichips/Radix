package radixtest;

// IMPORT ARRAYLIST
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RadixTest extends RadixSorting{

    /**
     * Main method for the sorting
     * @param args 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // DECLARATIONS AND INITIALIZATIONS
        long timeStart; // measure the time at the start of the program
        long elapsedTime = 0; // variable for the elapsed time since start
        
        
        
        // READ LINES FROM THE TEXT FILE
        int[] intArray={9, 420, 666, 324, 65, 645, 65, 87, 436, 78, 43 ,87 ,43 ,876};
        
        // BEGIN COUNTING TIME
        timeStart = System.currentTimeMillis();
        
        // CALL THE SORTING METHOD
        intArray=radix(intArray);
        
        // measure the count of time at the end of the program
        elapsedTime=System.currentTimeMillis();
        
        // PRINT THE NUMBERS IN ORDER AND THE DELTA TIME
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
        System.out.println("The time is "+ (elapsedTime - timeStart)+"ms\nor "+(elapsedTime - timeStart)/1000.0+"seconds"); //Output
    } 
}
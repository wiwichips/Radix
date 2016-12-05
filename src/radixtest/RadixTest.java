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
        
        timeStart = System.currentTimeMillis(); // begin counting time
        // READ LINES FROM THE TEXT FILE
        
        
        // measure the count of time at the end of the program
        elapsedTime=System.currentTimeMillis();
        System.out.println("The time is "+ (elapsedTime - timeStart)+"ms\nor "+(elapsedTime - timeStart)/1000.0+"seconds"); //Output
        
        
    } 
}
package DBL;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author aryan
 */
public class ReadFile {

    public String[][] readFile(String filePath) {
       
        // finding the length for the multidimensional array depending upon the
        // file passsed in arguement
        
        Path path = Paths.get(filePath);
        long lines = 0;
        
        try {
            lines = Files.lines(path).count();
        } catch(IOException e){
            e.printStackTrace();
        } catch(NoSuchElementException e) {
            String arr[][] = null;
            return arr;
        }
        
        
        int arraySize1 = (int)lines;
        int arraySize2 = 0;
        
        try {
            File obj = new File(filePath);
            Scanner  reader = new Scanner(obj);
            String line = reader.nextLine();
            
            // passing negative value in 2nd parameter enables returning array to be of any size
            String[] data = line.split(",", -1);        
            arraySize2 = data.length;
            reader.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        
        // initializing arrya with the size that is discoved above
        String[][] arr= new String[arraySize1][arraySize2];
        
        
        // reading the file passed as arguement
        try {
            File obj = new File(filePath);
            Scanner reader = new Scanner(obj);
            int i=0;
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                // splitting each line in file by ","
                String[] data = line.split(",", -1);
                               
                // storing each element in the arr array
                for(int j=0; j<data.length; j++){
                    arr[i][j] = data[j];
                }
                
                i++;
            }           
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        
        // returning array "arr"
        return arr;
        
    }

}

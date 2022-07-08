package DBL;

import java.io.*;


public class AppendData {
   
    public void appendStrToFile(String fileName, String str){
        
        try{
            // open given file in append mode by creating an 
            // object of BufferWriter class
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            
            out.write(str);
            
            out.close();
        } catch(IOException e){
            
            // Display message wehn exception occurs;
            
            System.out.println("exception occured "+ e);
        }
    }
    
}

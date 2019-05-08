/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reyta
 */
import java.io.*;
import java.util.ArrayList;
public class PrimeFile{
    static File file = new File("PrimeNumbers.dat");
    static ArrayList<Integer> thing = new ArrayList<>();
    //checks for a file 
    public static void fileExists() throws IOException{
        
        if (!file.exists()){
            boolean created = file.createNewFile();//this is a neat piece of code
        }
    }
    //writes to the file
    public static  void writeToFile(ArrayList<Integer> list) throws IOException{
        fileExists();//check for file before every write
        //init of fileWriter
        DataOutputStream fileWriter;
        fileWriter = new DataOutputStream(new FileOutputStream(file));//made me split it here to
        for (int i = 0;i<list.size();i++){ 
            fileWriter.writeInt(list.get(i));
        }//end of for
        fileWriter.close();
    }
    //reads from the file
    public static  void readFromFile() throws IOException{
        fileExists();// check for file before every read
        //init of fileReader
        DataInputStream fileReader;
        fileReader = new DataInputStream(new FileInputStream(file));// dont know why made me split it 
        for (int i = 0;i<fileReader.available();i++){
            thing.add(i, fileReader.readInt());
            //System.out.println("Hi Im working");  testing
        }// end of for
        fileReader.close();
        
    }
    
    
}

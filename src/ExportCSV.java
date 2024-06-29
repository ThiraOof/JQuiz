/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;

/**
 *
 * @author pc
 */
public class ExportCSV {
    public ExportCSV(){
        
    }
    public boolean exportCSV(int submittedId, ArrayList<Submitted> submitInformation, String address){
        File file = new File(address+".csv");
    try {
        // create FileWriter object with file as parameter
        FileWriter outputfile = new FileWriter(file);
  
        // create CSVWriter object filewriter object as parameter
        CSVWriter writer = new CSVWriter(outputfile);
  
        // adding header to csv
        String[] header = { "Name", "Score", "Submitted Time" };
        writer.writeNext(header);
        for(Submitted i: submitInformation){
            String[] data = { i.getName(), i.getScore()+"", i.getDate() };
            writer.writeNext(data);
        }
        // add data to csv
        
  
        // closing writer connection
        writer.close();
        return true;
    }
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }  
    return false;
}
}

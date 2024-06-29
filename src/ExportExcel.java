/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File; 
import java.util.ArrayList;
import javax.swing.JFileChooser;
import jxl.Workbook; 
import jxl.write.*; 

/**
 *
 * @author pc
 */
public class ExportExcel {
    public ExportExcel(){
        
    }
    public boolean exportExcel(int submittedId, ArrayList<Submitted> submitInformation, String address){
        WritableWorkbook wworkbook;
            try {
                  wworkbook = Workbook.createWorkbook(new File(address+".xls"));
            
                  //Sheet name
                  WritableSheet wsheet = wworkbook.createSheet("CouresReport"+submittedId, 0);
                  Label label =new Label(0, 0, "Name");
                  wsheet.addCell(label);
                  label =new Label(1, 0, "Score");
                  wsheet.addCell(label);
                  label =new Label(2, 0, "Submitted Time");
                  wsheet.addCell(label);
                  int row = 1;
                  for(Submitted i: submitInformation){
                      label =new Label(0, row, i.getName());
                      wsheet.addCell(label);
                      label =new Label(1, row, i.getScore()+"");
                      wsheet.addCell(label);
                      label =new Label(2, row, i.getDate());
                      wsheet.addCell(label);
                      row++;
                  }
                  
                  wworkbook.write();
                  wworkbook.close();
                  System.out.println("fineshed");
                  return true;
            } catch (Exception e) {
                    System.out.println(e);
	}
        
        return false;
    }
        
}

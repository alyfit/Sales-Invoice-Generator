/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.InvoiceHeader;

/**
 *
 * @author hp
 */
public class Controller {
    
    ArrayList<InvoiceHeader> readFile(){
        try {
            ArrayList<String> myData= checkForFile("F:\\Files\\InvoiceLines.csv");
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    
    ArrayList<String> checkForFile(String url) throws FileNotFoundException, IOException{
//             boolean isExist;
              File file = new File(url);
                ArrayList<String> myDateFromFile = new ArrayList<>();
              if(file.exists() && !file.isDirectory()) { 
                  BufferedReader bufReader = new BufferedReader(new FileReader(url)); 
                  String line = bufReader.readLine();
                  while (line != null)
                  { 
                      myDateFromFile.add(line); line = bufReader.readLine();
                  }
                  
                  bufReader.close();   
                  
               }
        return myDateFromFile;
    } 
}

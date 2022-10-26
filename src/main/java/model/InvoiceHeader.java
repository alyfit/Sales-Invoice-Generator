/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp
 */
public class InvoiceHeader {
    
    private int num;
    private Date date;
    private String name;
    private ArrayList<InvoiceLine> lines;
    
  
    public InvoiceHeader(int num, Date date, String name) {
        this.num = num;
        this.date = date;
        this.name = name;
    }
     public double geTotal(){
     double total = 0.0;
     for (int i = 0; i < lines.size(); i++){
         InvoiceLine line = lines.get (i);
          total += line.geTotal();
     }
     
     return total;
     
     }
    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "num=" + num + ", date=" + date + ", name=" + name + '}';
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hp
 */
public class InvoiceLine {
    
    private String name;
    private int count;
    private double price;
    private InvoiceHeader inv;

    public InvoiceLine(String name, int count, double price, InvoiceHeader inv) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.inv = inv;
    }
    public double geTotal(){
       return count * price;
       
    }
    
    public InvoiceHeader getInv() {
        return inv;
    }

    public void setInv(InvoiceHeader inv) {
        this.inv = inv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InvoiveLine{" + "name=" + name + ", count=" + count + ", price=" + price + '}';
    }
    
    
}

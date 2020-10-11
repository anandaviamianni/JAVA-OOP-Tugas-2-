/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3_1;

/**
 *
 * @author Ananda
 */
public class Shirt {
    // menentukan type atribut kedalam double dan string
    private String id = "S-001";
    private double priceIn = 0;
    private double totalPrice;

    // memasukan atribut kedalam contruction masing masing
    public Shirt(){
        this.totalPrice = 0;
    }
    
    // transfering objek id ke newid
    public void setId(String newId){
        id = newId;
    }

    public void setPrice(double price){
        priceIn = price;
    }
    
    // set pemanggilan info harga, dan akan mengulang ke line 15
    public double getPrice(){
        return priceIn;
    }
    
    //set pemanggilan info shirt
    public void getShirtInfo(){
        System.out.println("Shirt ID : "+ id);
        System.out.println("Shirt Price : " + priceIn);
    }
    
}

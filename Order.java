/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3_1; // membuat package 

/**
 *
 * @author Ananda
 */
public class Order { // membuat kelas order
    // menentukan type atribut kedalam double dan string
    private String id = "Order-00100"; 
    private Shirt[] shirts = new Shirt[3]; // menempatkan atribut shirts kedalam array 
    private double price; 
    private byte item;
    
    //set kelas menjadi public
    public Order(){
    }
    
    //transfering objek 
    public Order(String id){
        this.id = id;
    }
    
    //menambahkan instansiasi shirt baru
    public void addShirt(Shirt shirt){
        this.shirts[item]= shirt;
        item++;
    }
    
    // merumuskan total harga
    public double getTotalPrice(){
        double totalPrice = 0;
        for(byte i = 0; i <shirts.length; i++){ //perulangan jika program kurang dari panjang shirts yaitu panjang shirts telah di inisiasi hanya mencakup 3 item
            totalPrice = totalPrice + shirts[i].getPrice(); // jika i kurang dari panjang kelas atribut shirts maka akan mengeksekusi rumus pencari total price
        }
        return totalPrice;
    }
    
    
    // set pemanggilan order info
    public void getOrderInfo(){
        System.out.println("Order ID : "+ this.id);
        System.out.println("Total Price : "+ getTotalPrice());
    }
    
}

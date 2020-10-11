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
public class OrderTest {
    public static void main(String[] args) {
        //menjadikan class Shirt sebagai reference ke instance object yang telah dibuat
        Shirt srt1 = new Shirt();
        Shirt srt2 = new Shirt();
        Shirt srt3 = new Shirt();
        
        srt1.setId("Shirt 1"); // menginisiasi ID pakaian 1
        srt1.setPrice(20000); // menginisiasi Harga pakaian 1
        srt2.setId("Shirt 2");
        srt2.setPrice(15000);
        srt3.setId("Shirt 3");
        srt3.setPrice(10000);
        
        
        Order ord = new Order("Order-1");
        ord.addShirt(srt1); // memanggil tiap objek yang telah dibuat kedalam kelas order yang telah direference menjadi ord
        ord.addShirt(srt2);
        ord.addShirt(srt3);
        ord.getOrderInfo(); // memanggil fungsi getOrerInfo untuk menghitung keseluruhan harganya
    }
    
}

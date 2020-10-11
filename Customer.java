/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3_2;

/**
 *
 * @author Ananda
 */
public class Customer {
    // menginisiasi customer info dengan tipe string dan int
    String name, address, number, email;
    int ID;
    
    // membuat method overloading dengan nama yang berbeda (line 18 & 25) dengan parameter yang berbeda di dalamnya
    public void SetCustomerInfo (int parameterID, String name, String address, String phoneNumber){
        // this. adalah salah satu cara untuk memanggil isi dari parameter method dan diikuti dengan perubahan nama valuenya
        this.ID = parameterID;
        this.name = name;
        this.address =  address;
        this.number = phoneNumber;
    }
    
    public void SetCustomerInfo (int parameterID, String name, String address, String phoneNumber, String emailAddress){
        this.ID = parameterID;
        this.name = name;
        this.address = address;
        this.number = phoneNumber;
        this.email = emailAddress;
        
      // perbedaan dari method overloading tersebut terletak pada method 1 tidak terdapat email address dan method 2 terdapat email address
           
    }
}

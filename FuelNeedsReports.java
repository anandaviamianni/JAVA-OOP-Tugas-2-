/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Ananda
 */
public class FuelNeedsReports {
    // main method
    public static void main(String[] args) {
        Company comp1 = Company.getCompany(); //membuat reference objek class company menjadi comp1
        comp1.getName(); // memanggil nama company yang berada pada class company
        comp1.setVehicles("Helicopter"); //menginisiasi vehicles untuk index 0 pada array
        comp1.setVehicles("Taxi");
        comp1.setVehicles("Motor");
        comp1.getVehicles(); // memanggil seluruh atribut yang telah di inisiasikan sebelumnya
        
        Company comp2 = Company.getCompany(); // membuat reference objek class company menjadi comp2, jadi ada 2 reference objek
        comp2.getName(); // memanggil nama company
        comp2.setVehicles("BMW"); // set vehicles menjadi tambahan pada index array terakhir
        comp2.getVehicles();
        
        System.out.println("Company Name    : "+comp1.getName()); // print hasil outputan nama company
        System.out.println("Vehicles List   : "+comp1.getVehicles() ); // print hasil output nama kendaraan apa saja kedalam list yang telah dibuat
        
        System.out.println("Comapany name   : "+comp2.getName());
        System.out.println("Vehicles List   : "+comp2.getVehicles());
    }
    
}

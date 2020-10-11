/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import java.util.ArrayList; //karena kita akan memakai sebuah class, maka ini adalah constructornya untuk line 18

/**
 *
 * @author Ananda
 */
public class Company {
    private static Company com;
    private Company() {}
    private String nameCompany = "Ananda Company";
    private ArrayList<String> vehicles = new ArrayList<>();
    
    
    public String getName() {
        return nameCompany;
    }
    
    public static Company getCompany(){ //set Company menjadi dari private ke public
        if (com == null){ //setelah itu buat reference objek barunya
            com = new Company();
        }
        return com;
    }
    
    // mengembalikan nilai dari suatu objek yang telah berisi nilai dengan menggunakan list
    public ArrayList<String> getVehicles() {
        return vehicles;
    }
    
    // menambahkan nilai kedalam suatu atribut
    public void setVehicles(String vec){
        vehicles.add(vec);
    }
    
}
   

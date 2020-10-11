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
public class CustomerTest {
    //pemanggilan fungsi main
    public static void main(String[] args) {
        //menset kelas customer dengan cst1
        Customer cst1 = new Customer();
        // menginisiasikan isi dari method overloading yang telah dibuat di kelas customer
        cst1.SetCustomerInfo(1111, "Ananda Viamianni", "Jln. Bandung Asik", "081257342001");
        System.out.println("Parameter Id : " + cst1.ID); //memasukkan ID dari index pertama line 18 kedalam variable referensi objek
        System.out.println("Name : "+ cst1.name);
        System.out.println("Address : "+ cst1.address);
        System.out.println("Number Phone : "+ cst1.number);

        System.out.println("===============================");
        Customer cst2 = new Customer(); // menginisiasikan isi dari method overloading 2 yang telah dibuat di kelas customer
        cst2.SetCustomerInfo(7777, "Moko Coklat", "Jln. Bandung Rame", "0811228906", "mokocoklat@gmail.com");
        System.out.println("Parameter Id : " + cst2.ID); //mengeluarkan output ID yang berada pada index 0 line 26
        System.out.println("Name : " + cst2.name);
        System.out.println("Address : " + cst2.address);
        System.out.println("Phone Number : " + cst2.number);
        System.out.println("Email Address : " + cst2.email);
    }
  
    
}

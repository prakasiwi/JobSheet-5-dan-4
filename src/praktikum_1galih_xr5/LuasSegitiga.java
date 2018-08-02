/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_1galih_xr5;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class LuasSegitiga {
    
   public static void main(String[] args){
   // Deklarasi
   Double luas;
   int alas, tinggi;
   
// Membuat scanner baru
Scanner baru = new Scanner(System.in);

//Input
System.out.println("== Program hitung luas segitiga ==");
System.out.print("input alas: ");
alas = baru.nextInt();
System.out.print("input tinggi: ");
tinggi = baru.nextInt ();
System.out.print("input tinggi: ");

// Proses
luas = Double.valueOf((alas * tinggi) / 2);

// proses
luas = Double.valueOf((alas * tinggi) / 2);

// Output
System.out.println("Luas = " + luas);
   } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet5Prakasiwi;

/**
 *
 * @author galih
 */
public class OperatorBitwise {
    public static void main(String[] args) {
        int x = 12; // dikonveksikan ke biner = 0000 1100
        int y = 20; // dikonveksikan ke biner = 0001 0100
        
        int z;
        z = x | y;
        System.out.println("Hasil operasi bitwise OR "+z);
        
         z = x & y;
        System.out.println("Hasil operasi bitwise AND "+z);
        
         z = x ^ y;
        System.out.println("Hasil operasi bitwise XOR "+z);
        
         z = ~x;
        System.out.println("Hasil operasi bitwise NOT "+z);
        
         z = x << y;
        System.out.println("Hasil operasi bitwise shift left "+z);
        
         z = x >> y;
        System.out.println("Hasil operasi bitwise shift right "+z);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_1galih_xr5;

/**
 *
 * @author galih
 */
public class volumetabung {
    public static void main(String[] args) {
        
        //Deklarasi 
        Double pi, r, t, luas , volume;
        
        //Deskripsi
        r = 28.0;
        pi = 22.0/7.0;
        t = 18.3;
        
        //Proses
        luas = pi * r * r;
        volume = luas * t;
        
        //Output
        System.out.print("luas lingkaran =");
        System.out.println(luas);
        System.out.print("volume tabung =");
        System.out.println(volume);
    }
}

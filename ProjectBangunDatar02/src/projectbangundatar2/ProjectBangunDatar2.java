/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar2;

/**
 *
 * @author Bagus C
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        Segitiga s = new Segitiga();
        
        
        
        System.out.println("Luas Persegi Panjang Pertama adalah " + pp.luasPersegiPanjang(10, 5) + " cm" + " Dan Kelilingnya " + pp.kelilingPersegiPanjang(10, 5) + " cm");
        System.out.println("Luas Persegi Panjang Kedua adalah " + pp.luasPersegiPanjang(3.6, 8) + " cm" + " Dan Kelilingnya " + pp.kelilingPersegiPanjang(3.6, 8) + " cm");
        System.out.println("Luas Persegi Panjang Ketiga adalah " + pp.luasPersegiPanjang(6, 8.3) + " cm" + " Dan Kelilingnya " + pp.kelilingPersegiPanjang(6, 8.3) + " cm");
        System.out.println("Luas Persegi Panjang Keempat adalah " + pp.luasPersegiPanjang(5.6, 8.8) + " cm" + " Dan Kelilingnya " + pp.kelilingPersegiPanjang(5.6, 8.8) + " cm\n");
        
        System.out.println("Luas Persegi Pertama adalah " + p.luasPersegi(4.5) + " cm" + " Dan Kelilingnya " + p.kelilingPersegi(4.5) + " cm");
        System.out.println("Luas Persegi Kedua adalah " + p.luasPersegi(8) + " cm" + " Dan Kelilingnya " + p.kelilingPersegi(8) + " cm\n");
        
        System.out.println("Luas Lingkaran Pertama adalah " + l.luasLingkaran(5) + " cm"  + " Dan Kelilingnya " + l.kelilingLingkaran(5) + " cm");
        System.out.println("Luas Lingkaran Kedua adalah " + l.luasLingkaran(7.4) + " cm" + " Dan Kelilingnya " + l.kelilingLingkaran(7.4) + " cm\n");
        
        System.out.println("Luas Segitiga Pertama adalah " + s.luasSegitiga(8, 10) + " cm");
        System.out.println("Luas Segitiga Kedua adalah " + s.luasSegitiga(8, 11.5) + " cm");
        System.out.println("Luas Segitiga Ketiga adalah " + s.luasSegitiga(12.2, 9) + " cm");
        System.out.println("Luas Segitiga Keempat adalah " + s.luasSegitiga(13.9, 20.7) + " cm");
    }
    
}

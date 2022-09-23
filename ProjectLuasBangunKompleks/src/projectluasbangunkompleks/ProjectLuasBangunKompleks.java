/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectluasbangunkompleks;

/**
 *
 * @author Bagus C
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi p = new Persegi();
        double luasPersegi = p.luasPersegi(42);
        
        Lingkaran l = new Lingkaran();
        double luasLingkaran1 = l.luasLingkaran(21);
        double luasLingkaran2 = l.luasLingkaran(14);
        double luasLingkaran3 = l.luasLingkaran(7);
        
        double luasPertama = luasPersegi + (luasLingkaran1 / 2 * 4);
        double luasKedua = (luasLingkaran2 / 2) - (luasLingkaran3 /2 * 2);
        
        System.out.println("Luas Persegi : " + luasPersegi);
        System.out.println("Luas Lingkaran " + luasLingkaran1);
        System.out.println("Luas pertama : " + luasPertama);
        System.out.println("Luas kedua : " + luasKedua);
    }
}

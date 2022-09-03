/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author Dimasr
 */
public class PersegiPanjang {
    // attribut
    
    int panjang;
    int lebar;
    
    // method
    
    void hitungLuas(){
       int luas = this.panjang * this.lebar;
       System.out.println("Luas : " + luas + " satuan luas");
    }
    
    void hitungKeliling(){
        int keliling = 2 * (this.panjang + this.lebar);
        System.out.println("Keliling : " + keliling + " satuan panjang");
    }
}

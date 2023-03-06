/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
//Inheritance & Interface
public class Balok extends PersegiPanjang implements MenghitungRuang, MenghitungBidang{
    
    //Encapsulation
    private int tinggi;
    
    //Constructor
    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    //Encapsulation Setter Getter
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    //Override
    @Override
    public double hitungluaspermukaan() {
       double luaspermukaan = 2*(panjang*lebar+lebar*tinggi+panjang*tinggi);
        return luaspermukaan;
    }

    @Override
    public double hitungvolume() {
        double volume = panjang*lebar*tinggi;
        return volume;
    }

    @Override
    public double hitungluas() {
       double luas = panjang*lebar;
        return luas;
    }

    @Override
    public double hitungkeliling() {
        double keliling = (2*panjang)+(2*lebar);
        return keliling;
    }
    
    //Overload 
    public double hitungluas(int panjang, int lebar) {
       double luas = panjang*lebar;
        return luas;
    }
    
    public double hitungkeliling(int panjang, int lebar) {
        double keliling = (2*panjang)+(2*lebar);
        return keliling;
    }
}

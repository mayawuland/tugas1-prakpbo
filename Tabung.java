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
public class Tabung extends Lingkaran implements MenghitungRuang, MenghitungBidang{
    
    //Encapsulation
    private int tinggi;
    
    //Constructor
    public Tabung(int tinggi, int jari) {
        super(jari);
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
        double luaspermukaan = 2*Math.PI*jari*(jari+tinggi);
        return luaspermukaan;
    }

    @Override
    public double hitungvolume() {
        double volume = Math.PI*jari*jari*tinggi;
        return volume;
    }

    @Override
    public double hitungluas() {
        double luas = Math.PI*jari*jari;
        return luas;   
    }

    @Override
    public double hitungkeliling() {
        double keliling = 2*Math.PI*jari;
        return keliling;
    }
    
    //Overload
    public double hitungluas(int jari) {
        double luas = Math.PI*jari*jari;
        return luas;   
    }
    
    public double hitungkeliling(int jari) {
        double keliling = 2*Math.PI*jari;
        return keliling;
    }
}

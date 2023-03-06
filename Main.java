/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pilih;
        int y = 0;
        
        //Instansiasi
        Balok balok = new Balok(0,0,0);
        Tabung tabung = new Tabung(0,0);
        
        do {
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok \n2. Hitung Tabung \n0. Exit");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            System.out.println("");
            
            switch(pilih){
                case 1 -> {
                    System.out.print("Masukkan panjang : ");
                    balok.panjang = input.nextInt();
                    System.out.print("Masukkan lebar   : ");
                    balok.lebar = input.nextInt();
                    System.out.print("Masukkan tinggi  : ");
                    int tinggi = input.nextInt();
                    balok.setTinggi(tinggi); //Encapsulation
                    
                    System.out.println("");
                    
                    System.out.println("Luas persegi panjang     : "+ balok.hitungluas());
                    System.out.println("Keliling persegi panjang : "+ balok.hitungkeliling());
                    System.out.println("Luas permukaan balok     : "+ balok.hitungluaspermukaan());
                    System.out.println("Volume balok             : "+ balok.hitungvolume());
                    
                    System.out.println("");
                    System.out.print("Ulangi? (Ya: 1 || Tidak: 0) ");
                    y = input.nextInt();
                }
                case 2 -> {
                    System.out.print("Masukkan jari-jari : ");
                    tabung.jari = input.nextInt();
                    System.out.print("Masukkan tinggi    : ");
                    int tinggii = input.nextInt();
                    tabung.setTinggi(tinggii); //Encapsulation
                    
                    System.out.println("");
                    
                    System.out.println("Luas lingkaran        : "+ tabung.hitungluas());
                    System.out.println("Keliling lingkaran    : "+ tabung.hitungkeliling());
                    System.out.println("Luas permukaan tabung : "+ tabung.hitungluaspermukaan());
                    System.out.println("Volume tabung         : "+ tabung.hitungvolume());
                    
                    System.out.println("");
                    System.out.print("Ulangi? (Ya: 1 || Tidak: 0) ");
                    y = input.nextInt();
                }
                case 0 -> {
                    y = 0;
                }
            }
            System.out.println("");
        }while(y==1);
    }
    
}

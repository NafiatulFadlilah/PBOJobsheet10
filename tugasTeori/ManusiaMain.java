package tugasTeori;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas: Teori ~ Penerapan Abstract Class
 */
public class ManusiaMain {
    public static void main(String[] args){
        System.out.println("======================||PROGRAM PERKENALAN|=====================");
        
        System.out.println("\n----------------------------------------------------------------");
        Orang_Indonesia ina = new Orang_Indonesia("Damar Wicaksono", 19, "Indonesia", 175, 63);
        ina.memperkenalkanDiri();
        ina.menerapkanSistemPemerintahan();
        ina.ciriMata();
        ina.caraMakan();
        ina.menyetirMobil();
        
        System.out.println("\n----------------------------------------------------------------");
        Orang_Korea kor = new Orang_Korea("Park Jeongwoo", 17, "Korea Selatan", 181, 60);
        kor.memperkenalkanDiri();
        kor.menerapkanSistemPemerintahan();
        kor.ciriMata();
        kor.caraMakan();
        kor.menyetirMobil();
        
        System.out.println("\n----------------------------------------------------------------");
        Orang_Amerika us = new Orang_Amerika("Justin Park", 18, "United States", 185, 65);
        us.memperkenalkanDiri();
        us.menerapkanSistemPemerintahan();
        us.ciriMata();
        us.caraMakan();
        us.menyetirMobil();
    }
}
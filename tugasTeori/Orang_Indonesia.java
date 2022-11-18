package tugasTeori;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas: Teori ~ Penerapan Abstract Class
 */
public class Orang_Indonesia extends Manusia{    
    Orang_Indonesia(String nama, int umur, String negara, int tinggi, int berat){
        super(nama, umur, negara, tinggi, berat);
    }

    @Override
    public void memperkenalkanDiri(){
        System.out.println("Halo, apa kabar? Aku " + super.nama + " dari " + super.negara + 
                ". Sekarang umurku " + super.bertambahUmur() + " tahun. Tinggiku " + super.bertambahTinggi() 
                + " cm dan berat badanku " + super.bertambahBerat() + " kg. Senang bertemu dengan kalian.");
    }
    
    @Override 
    public void menerapkanSistemPemerintahan(){
        System.out.println("Indonesia menganut sistem pemerintahan Presidensial.");
    }
    
    @Override
    public void ciriMata(){
        System.out.println("Orang Indonesia dikenal memiliki kelopak mata ganda.");
    }

    @Override
    public void caraMakan(){
        System.out.println("Orang Indonesia memiliki budaya makan menggunakan tangan.");
    }
    
    @Override 
    public void menyetirMobil(){
        System.out.println("Di Indonesia, orang menyetir mobil di sebelah kanan.");
    }
}
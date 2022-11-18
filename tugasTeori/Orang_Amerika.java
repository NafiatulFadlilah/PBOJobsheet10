package tugasTeori;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas: Teori ~ Penerapan Abstract Class
 */
public class Orang_Amerika extends Manusia{
    Orang_Amerika(String nama, int umur, String negara, int tinggi, int berat){
        super(nama, umur, negara, tinggi, berat);
    }

    @Override
    public void memperkenalkanDiri(){
        System.out.println("Hello everyone. Lemme introduce myself, my name is " + super.nama + ". I'm " 
                + super.bertambahUmur() + " years old. My height is " + super.bertambahTinggi() 
                + " cm and my weight is " + super.bertambahBerat() + " kg. Nice to meet you.");
    }
    
    @Override 
    public void menerapkanSistemPemerintahan(){
        System.out.println("Amerika menganut sistem pemerintahan Republik Konstitusional Federal.");
    }
    
    @Override
    public void ciriMata(){
        System.out.println("Orang Amerika atau orang barat pada umumnya memiliki beragam warna kornea mata.");
    }

    @Override
    public void caraMakan(){
        System.out.println("Orang Amerika atau orang barat pada umumnya memiliki budaya makan menggunakan garpu.");
    }
    
    @Override 
    public void menyetirMobil(){
        System.out.println("Di Amerika, orang menyetir mobil di sebelah kiri.");
    }
}
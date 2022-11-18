package tugasTeori;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas: Teori ~ Penerapan Abstract Class
 */
public abstract class Manusia {
    protected String nama, negara;
    protected int umur, tinggi, berat;
    
    Manusia(String nama, int umur, String negara, int tinggi, int berat){
        this.nama = nama;
        this.umur = umur;
        this.negara = negara;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public int bertambahUmur(){
        return this.umur += 1;
    }
    
    public int bertambahTinggi(){
        return this.tinggi += 1;
    }
    
    public int bertambahBerat(){
        return this.berat += 1;
    }
    
    public abstract void memperkenalkanDiri();
    public abstract void menerapkanSistemPemerintahan();
    public abstract void ciriMata();
    public abstract void caraMakan();
    public abstract void menyetirMobil();
}
package tugasTeori;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas: Teori ~ Penerapan Abstract Class
 */
public class Orang_Korea extends Manusia{
    Orang_Korea(String nama, int umur, String negara, int tinggi, int berat){
        super(nama, umur, negara, tinggi, berat);
    }

    @Override
    public void memperkenalkanDiri(){
        System.out.println("Annyeonghaseyo chingudeul. Jeoneun " + super.nama + "-rago hamnida. Ije jeoneun " 
                + super.bertambahUmur() + "-salimnida. Jee khineun " + super.bertambahTinggi() 
                + " cm-igo mommukeneun " + super.bertambahBerat() + " kg-imnida. Bangabseumnida.");
    }
    
    @Override 
    public void menerapkanSistemPemerintahan(){
        System.out.println("Korea Selatan menganut sistem pemerintahan Presidensial Campuran.");
    }
    
    @Override
    public void ciriMata(){
        System.out.println("Orang Korea Selatan mayoritas tidak memiliki lipatan kelopak mata (monolid).");
    }

    @Override
    public void caraMakan(){
        System.out.println("Orang Korea memiliki budaya makan menggunakan sumpit.");
    }
    
    @Override 
    public void menyetirMobil(){
        System.out.println("Di Korea Selatan, orang menyetir mobil di sebelah kiri.");
    }
}
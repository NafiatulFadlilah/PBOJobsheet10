package abstractclass;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Praktikum PBO - Abstract Class
 */
public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;
    
    public Orang(String nama){
        this.nama = nama;
    }
    
    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaanku bergerak dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("Hewan peliharaanku termasuk jenis hewan: ");
        this.hewanPeliharaan.jenisHewan();
        System.out.println("Hewan peliharaanku hidup di: ");
        this.hewanPeliharaan.habitat();
        System.out.println("-----------------------------------------");
    }
}
package abstractclass;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Praktikum PBO - Abstract Class
 */
public class Program {
    public static void main(String[] args){
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        Burung elang = new Burung();
        
        Orang jongu = new Orang("Park Jeongwoo");
        Orang ruto = new Orang("Watanabe Haruto");
        Orang ajun = new Orang("Kim Junkyu");
        
        jongu.peliharaHewan(kucingKampung);
        ruto.peliharaHewan(lumbaLumba);
        ajun.peliharaHewan(elang);
        
        jongu.ajakPeliharaanJalanJalan();
        ruto.ajakPeliharaanJalanJalan();
        ajun.ajakPeliharaanJalanJalan();
    }
}
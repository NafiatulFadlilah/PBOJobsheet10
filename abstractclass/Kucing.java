package abstractclass;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Praktikum PBO - Abstract Class
 */
public class Kucing extends Hewan{

    @Override
    public void bergerak() {
        System.out.println("Berjalan dengan KAKI, \"tap..tap\"");
    }
    
    @Override
    public void jenisHewan(){
        System.out.println("Mamalia");
    }
    
    @Override 
    public void habitat(){
        System.out.println("Darat");
    }
}
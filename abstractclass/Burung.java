package abstractclass;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Praktikum PBO - Abstract Class
 */
public class Burung extends Hewan{
    
    @Override
    public void bergerak() {
        System.out.println("Terbang dengan SAYAP, \"pakk..pakk..\"");
    }
    
    @Override
    public void jenisHewan(){
        System.out.println("Aves");
    }
    
    @Override 
    public void habitat(){
        System.out.println("Darat");
    }
}
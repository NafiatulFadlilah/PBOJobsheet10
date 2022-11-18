package abstractclass;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Praktikum PBO - Abstract Class
 */
public class Ikan extends Hewan{

    @Override
    public void bergerak() {
        System.out.println("Berenang dengan SIRIP, \"wush..wush..\"");
    }
    
    @Override
    public void jenisHewan(){
        System.out.println("Mamalia");
    }
    
    @Override 
    public void habitat(){
        System.out.println("Air");
    }
}
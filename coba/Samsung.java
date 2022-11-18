package coba;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Coba Abstract Class
 */
public class Samsung extends Printer{
    public void fotocopy(){
        System.out.println("Samsung bisa digunakan untuk fotocopy");
    }

    @Override
    public void printing() {
        System.out.println("Samsung mencetak dokumen memakai carbon");
    }
    
}
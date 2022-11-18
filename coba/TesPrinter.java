package coba;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Tugas Coba Abstract Class
 */
public class TesPrinter {
    public static void main(String[] args){
        Canon canon = new Canon();
        Samsung samsung = new Samsung();
        canon.printing();
        samsung.fotocopy();
        samsung.printing();
        
        canon.scanner();
    }
}
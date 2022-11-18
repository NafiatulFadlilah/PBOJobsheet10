package abstractclass;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah (13)
 * Praktikum PBO - Abstract Class
 */
public abstract class Hewan {
    private int umur;
    
    protected Hewan(){
        this.umur = 0;
    }
    public void bertambahUmur(){
        this.umur += 1;
    }
    public abstract void bergerak();
    public abstract void jenisHewan();
    public abstract void habitat();
    
}
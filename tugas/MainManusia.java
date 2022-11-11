package tugas;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Tugas Overriding Dynamic Method Dispatch
 */
public class MainManusia {
    public static void main(String[] args){
        Manusia man = new Manusia();
        Dosen ds = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        man.bernafas();
        man.makan();
        ds.makan();
        ds.lembur();
        mhs.makan();
        mhs.tidur();
    }
}
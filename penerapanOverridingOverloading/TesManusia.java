package penerapanOverridingOverloading;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030 
 * Nama: Nafiatul Fadlilah
 * CONTOH OVERLOADING
 */
public class TesManusia {
    public static void main(String[] args){
        Manusia man = new Manusia();
        man.setBiodata("Joko");
        man.setBiodata("Joko", 20, "Jakarta");
        man.setBiodata("Joko", 20);
    }
}
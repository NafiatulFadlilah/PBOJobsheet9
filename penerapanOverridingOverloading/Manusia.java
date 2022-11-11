package penerapanOverridingOverloading;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030 
 * Nama: Nafiatul Fadlilah
 * CONTOH OVERLOADING
 */
public class Manusia {
    public void setBiodata(String nama){
        System.out.println("method setBiodata yang pertama yang dipanggil");
    }
    
    public void setBiodata(String nama, int umur){
        System.out.println("method setBiodata yang kedua yang dipanggil");
    }
    
    public void setBiodata(String nama, int umur, String alamat){
        System.out.println("method setBiodata yang ketiga yang dipanggil");
    }
}
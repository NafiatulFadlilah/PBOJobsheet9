package tugas;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Tugas Overloading
 */
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    
    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling;
        return keliling = sisiA + sisiB + sisiC;
    }
    
    public double keliling(int sisiA, int sisiB){
        double c;
        return c = Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
    }  
}
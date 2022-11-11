package tugas;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Tugas Overloading
 */
public class MainSegitiga {
    public static void main(String[] args){
        Segitiga sg = new Segitiga();
        System.out.println("Total Sudut = " + sg.totalSudut(45));
        System.out.println("Total Sudut = " + sg.totalSudut(45, 30));
        System.out.println("Total Keliling = " + sg.keliling(16, 30, 34));
        System.out.println("Panjang Sisi C = " + sg.keliling(16, 30));
    }   
}
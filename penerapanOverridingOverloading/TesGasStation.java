package penerapanOverridingOverloading;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030 
 * Nama: Nafiatul Fadlilah
 * CONTOH OVERLOADING
 */
public class TesGasStation {
    public static void main(String[] args){
        MobilMewah alphard = new MobilMewah();
        MobilKuno carry = new MobilKuno();
        GasStation gs = new GasStation();
        
        gs.isiBahanBakar(carry, 20000);
        gs.isiBahanBakar(alphard, 20000);   
    }
}

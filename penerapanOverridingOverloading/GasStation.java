package penerapanOverridingOverloading;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030 
 * Nama: Nafiatul Fadlilah
 * CONTOH OVERLOADING
 */ 
public class GasStation {
    public void isiBahanBakar(MobilMewah mw, int bayar){
        int perLiter = 10000;
        int liter = bayar / perLiter;
        System.out.println("Mobil mewah telah diisi dengan pertamax sebanyak " + liter + " liter");
    }
    
    public void isiBahanBakar(MobilKuno mk, int bayar){
        int perLiter = 5000;
        int liter = bayar / perLiter;
        System.out.println("Mobil kuno telah diisi dengan pertalite sebanyak " + liter + " liter");
    }
}
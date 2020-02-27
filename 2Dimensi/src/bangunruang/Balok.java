
package bangunruang;
import bangundatar.*;

public class Balok extends Parent implements bangunRuang {
    
      public Balok (double luas ,double tinggi, double panjang,double lebar) {
        super.luas = luas;
        super.tinggi = tinggi;
        super.panjang = panjang;
        super.lebar=lebar;
        this.Luas();
        this.Volume();
    }
    
    public double Luas(){
        luaspermukaan = 2*(panjang*lebar+panjang*tinggi+lebar*tinggi); 
        return luaspermukaan;
    }
    
    public double Keliling(){
        return keliling;
    }
    
    public double Volume(){
        volume =panjang*lebar*tinggi;
        return volume;
    }
    
}

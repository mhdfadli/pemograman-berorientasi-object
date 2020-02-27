
package bangunruang;

import bangundatar.*;

public class Kubus extends Parent implements bangunRuang{

    public Kubus(double luas,double tinggi, double sisi) {
        super.luas = luas;
        super.sisi = sisi;
        super.tinggi = tinggi;
        this.Luas();
        this.Volume();
    }
    
    public double Luas(){
        luaspermukaan = super.luas*6; 
        return luaspermukaan;
    }
    
    public double Keliling(){
        return keliling;
    }
    
    public double Volume(){
        volume = sisi*sisi*sisi;
        return volume;
    }
}

package bangunruang;

import bangundatar.*;
import java.lang.Math.*;

public class Limas extends Parent implements bangunRuang{

    public Limas(double luas,double tinggi, double sisi) {
        super.luas = luas;
        super.sisi = sisi;
        super.tinggi = tinggi;
        this.Luas();
        this.Volume();
    }
    
    public double Luas(){
       double tinggi_segitiga=Math.sqrt(Math.pow((sisi/2),2) + Math.pow(tinggi,2));
       double luas_segitiga=sisi*tinggi_segitiga/2;
        luaspermukaan = super.luas+ 4*luas_segitiga; 
        return luaspermukaan;
    }
    
    public double Keliling(){
        return keliling;
    }
    
    public double Volume(){
        volume = (sisi*sisi*tinggi)/3;
        return volume;
    }
}

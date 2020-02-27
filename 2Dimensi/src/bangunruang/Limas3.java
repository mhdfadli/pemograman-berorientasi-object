
package bangunruang;

import bangundatar.*;
import java.lang.Math.*;

public class Limas3 extends Parent implements bangunRuang{

    public Limas3(double alas,double tinggi3, double tinggi) {
        super.alas = alas;
        super.tinggi3 = tinggi3;
        super.tinggi = tinggi;
        this.Luas();
        this.Volume();
    }
    
    public double Luas(){
       double tinggi_segitiga=Math.sqrt(Math.pow((alas/2),2) + Math.pow(tinggi,2));
       double luas_segitiga=sisi*tinggi_segitiga/2;
        luaspermukaan = super.getLuas()+ 3*luas_segitiga; 
        return luaspermukaan;
    }
    
    public double Keliling(){
        return keliling;
    }
    
    public double Volume(){
        
        volume = (super.getLuas()*tinggi)/3;
        return volume;
    }
}

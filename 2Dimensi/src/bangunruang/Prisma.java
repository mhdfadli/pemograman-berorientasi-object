
package bangunruang;

import bangundatar.*;
import java.lang.Math.*;

public class Prisma extends Parent implements bangunRuang{

    public Prisma(double alas,double tinggi3, double tinggi) {
        super.alas = alas;
        super.tinggi3 = tinggi3;
        super.tinggi = tinggi;
        this.Luas();
        this.Volume();
    }
    
    public double Luas(){
        double luas_sisi_tegak=alas*tinggi;
        luaspermukaan =(alas*tinggi3)+ 3*luas_sisi_tegak; 
        return luaspermukaan;
    }
    
    public double Keliling(){
        return keliling;
    }    
    public double Volume(){        
        volume =(alas*tinggi3*tinggi)/2;
        return volume;
    }
}


package bangunruang;

import bangundatar.*;
import java.lang.Math.*;

public class LimasPanjang extends Parent implements bangunRuang{

    public LimasPanjang(double luas,double tinggi, double panjang,double lebar) {
        super.luas = luas;
        super.tinggi = tinggi;
        super.panjang = panjang;
        super.lebar=lebar;
        this.Luas();
        this.Volume();
    }
    
    public double Luas(){
      double tinggi_segitiga1=Math.sqrt(Math.pow((panjang/2),2) + Math.pow(tinggi,2));//untuk lebar
      double tinggi_segitiga2=Math.sqrt(Math.pow((lebar/2),2) + Math.pow(tinggi,2));//untuk panjang
       double luas_segitiga1=(lebar*tinggi_segitiga1)/2;
       double luas_segitiga2=(panjang*tinggi_segitiga2)/2;
        luaspermukaan =(panjang*lebar)+ 2*luas_segitiga1+2*luas_segitiga2; 
        return luaspermukaan;
    }
    
    public double Keliling(){
        return keliling;
    }    
    public double Volume(){        
        volume =(panjang*lebar*tinggi)/3;
        return volume;
    }
}

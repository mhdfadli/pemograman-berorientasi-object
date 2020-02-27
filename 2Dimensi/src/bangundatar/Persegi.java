
package bangundatar;

public class Persegi extends Parent{
    
    public Persegi(double sisi){
        super.sisi = sisi;
        Luas();
        Keliling();
    }
    
    public double Luas(){
        luas = sisi*sisi;
        return luas;
    }
    
    public double Keliling(){
        keliling = 4*sisi;
        return keliling;
    }
}

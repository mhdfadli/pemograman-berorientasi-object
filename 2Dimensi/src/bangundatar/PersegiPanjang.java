
package bangundatar;

public class PersegiPanjang extends Parent{

      public PersegiPanjang(double panjang, double lebar){
        super.panjang= panjang;
        super.lebar=lebar;
        Luas();
        Keliling();
    }
    
    public double Luas(){
        luas = panjang*lebar;
        return luas;
    }
    
    public double Keliling(){
        keliling = 2*(panjang+lebar);
        return keliling;
    }
    
}

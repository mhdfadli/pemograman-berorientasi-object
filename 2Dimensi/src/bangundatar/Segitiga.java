package bangundatar;

public class Segitiga extends Parent{
    
    public Segitiga(double alas, double tinggi3){
        super.alas = alas;
        super.tinggi3=tinggi3;
        Luas();
        Keliling();
    }
    
    public double Luas(){
        luas = (alas*tinggi3)/2;
        return luas;
    }
    
    public double Keliling(){
       keliling =  alas*3;
        return keliling;
    }
}

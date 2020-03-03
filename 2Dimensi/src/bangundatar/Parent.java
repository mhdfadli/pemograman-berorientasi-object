
package bangundatar;

public abstract class Parent {
    public final double pi = 3.14;
    public double sisi, panjang, lebar, tinggi;
    public double alas,tinggi3, luas, keliling, luaspermukaan, luasalas, volume;
    
    public abstract double Luas();   
    public abstract double Keliling();
    
    public double getLuas(){
        return luas;
    }
    
    public double getKeliling(){
        return keliling;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double getLuasPermukaan(){
        return luaspermukaan;
    }
}

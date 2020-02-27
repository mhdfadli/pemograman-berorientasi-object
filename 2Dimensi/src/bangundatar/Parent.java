/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Lab Informatika
 */
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan28feb.animal;

/**
 *
 * @author Lab Informatika
 */
public abstract class Animal {
    protected int legs;
    
    protected Animal(int legs){
        this.legs = legs;
    }
    abstract void eat();
    void walk(){
        System.out.println("Hewan ini berjalan dengan " + legs + " kaki");
    }
}

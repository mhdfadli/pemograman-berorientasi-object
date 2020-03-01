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
public class Fish extends Animal implements Pet{
    String name;
    public Fish(){
    super(0);
    }

    @Override
    void eat() {
        System.out.println("Makan Bakteri");
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Tidak berjalan tapi berenang");
    }
    
}

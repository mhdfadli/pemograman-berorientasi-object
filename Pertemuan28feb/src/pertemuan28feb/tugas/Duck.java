/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan28feb.tugas;

import pertemuan28feb.tugas.fly.FlyBehaviour;
import pertemuan28feb.tugas.sound.SoundBehaviour;
import pertemuan28feb.tugas.attack.AttackBehaviour;
import pertemuan28feb.tugas.defend.DefendBehaviour;

public class Duck {
    private FlyBehaviour flyBehaviour;
    private SoundBehaviour soundBehaviour;
    private AttackBehaviour attackBehaviour;
    private DefendBehaviour defendBehaviour;
    
    
    public Duck( FlyBehaviour terbang, SoundBehaviour suara, AttackBehaviour serang, DefendBehaviour bertahan)
    {
        this.flyBehaviour=terbang;
        this.soundBehaviour=suara;
        this.attackBehaviour=serang;
        this.defendBehaviour=bertahan;
    }
    
    /* public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }*/

    
    public void gettAttack()
    {
        attackBehaviour.attack();
    }
    public void getSound()
    {
        soundBehaviour.sound();
    }
    public void getFly()
    {
        flyBehaviour.fly();
    }
    public void getDefend()
    {
        defendBehaviour.defend();
    }
         
  
}

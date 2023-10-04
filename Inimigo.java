/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.Random;

/**
 *
 * @author Mad Malware
 */
    public class Inimigo extends Personagem { 

    public Inimigo(String name,int maxHp, int dano) {
        super(name, maxHp, maxHp, dano);
    }
    
    public void Info(){
        System.out.println("Status do inimigo: ");
        System.out.println("Hp: " + super.gethp() + "/" + super.getmaxHp() + ".");
        System.out.println("Força: "+ super.getdano());
    }
    
    @Override
    public int ataque() {
        Random rand = new Random();
        int ataque = rand.nextInt(super.getdano()) + 1;
        return ataque;
    }
    
    @Override
    public int getmaxHp(){ 
        return super.getmaxHp(); 
    } 
    
    @Override
    public String getname(){ 
        return super.getname(); 
    }    
    
    @Override
    public int getdano(){ 
        return super.getdano(); 
    }
    
    @Override
    public int gethp(){ 
        return super.gethp(); 
    }
    
}
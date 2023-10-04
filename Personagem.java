/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.Random;

/**
 *
 * @author msousa
 */
public abstract class Personagem {
    
    private String name; 
    private int dano;
    private int hp;
    private int maxHp;
        
    public Personagem(String name, int hp, int maxHp, int dano) { 
        this.name = name; 
        this.maxHp = maxHp; 
        this.hp = maxHp; 
        this.dano = dano; 
    } 
    
    public int ataque() {
        Random rand = new Random(); 
        int ataque = rand.nextInt(this.dano) + 1; 
        return ataque; 
    }
    
    public int getmaxHp(){ 
        return maxHp; 
    } 
    
    public String getname(){ 
        return name; 
    }    
    
    public int getdano(){ 
        return dano; 
    }
    
    public int gethp(){ 
        return hp; 
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @param dano the dano to set
     */
    public void setdano(int dano) {
        this.dano = dano;
    }

    /**
     * @param maxHp the maxHp to set
     */
    public void setmaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
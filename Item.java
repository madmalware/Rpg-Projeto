/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author Mad Malware
 */
public class Item {
    
    private String name;
    private int dano;
    private boolean equipado;
    
    public Item(String name, int dano) {
        this.name = name;
        this.dano = dano;
        this.equipado = false;
    }
    
    public boolean isEquipado(){
        return equipado;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the dano
     */
    public int getDano() {
        return dano;
    }

    public void setEquipado(boolean equipado) {
        this.equipado = equipado;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    
}
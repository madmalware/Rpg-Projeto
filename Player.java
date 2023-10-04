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
public class Player extends Personagem{

    Story story = new Story();
    private Inventario<Item> inventario;
    //Inventario inventario = new Inventario();
    
    Player jogador;

    //Item itemEquipado = getItemEquipado(jogador);

   
    private int xp;

    public Player(){
            super("", 20, 20, 5);
            this.inventario = new Inventario<>();
    }
    
    public Player(String name, Inventario<Item> inventario) {
        super(name, 20, 20, 3);
        this.xp = 0;
        this.inventario = jogador.getInventario();
    }
   
    public void Info(){
        
        GameLogic.Titulo("Seu status: ");
        System.out.println("Hp: " + super.gethp() + "/" + super.getmaxHp() + ".");
        System.out.println("Xp: "+ this.xp);
        System.out.println("Força: "+ super.getdano());

        Item armaEquipada = getItemEquipado(jogador);
    
        if (armaEquipada != null) {
            System.out.println("Arma equipada: " + armaEquipada.getName());
        } else {
            System.out.println("Arma equipada: Nenhuma arma equipada.");
        }
        
        System.out.println();
    }
    
    public void Curar(){
        super.setHp(getmaxHp());
    }
        
   
    @Override
    public int ataque() {
        Random rand = new Random();
        int ataque = rand.nextInt(super.getdano()) + 1;
        return ataque;
    }
    
    public Item getItemEquipado(Player jogador){
        //Inventario<Item> inventario = jogador.getInventario();
        
        for (Item item : inventario.getItens()) {
            if (item.isEquipado() == true) {
                return item;
            }
                
        }
        return null; 
    }
    
    
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
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

    /**
     * @return the inventario
     */
    public Inventario<Item> getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(Inventario<Item> inventario) {
        this.inventario = inventario;
    }

    
}
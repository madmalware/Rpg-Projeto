/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mad Malware
 */
public class GameLogic {
    
    boolean jogadorVenceu = false;
    boolean inimigoVenceu = false;
    public static boolean isRunning = true;
    
    public static int lugar = 0, ato = 1;
    public static String[] lugares = {"Midsommar", "Nix", "Ardoris", "Tenebris"};
    Player jogador;
    
    static Scanner scanner = new Scanner(System.in);
    Inventario inventario = new Inventario();
    
    // ARMAS
    
    Item a1 = new Item("Biohazard", 15);
    Item a2 = new Item("Blizzard Bow", 25);
    Item a3 = new Item("Anthropocene", 35);
    Item a4 = new Item("Magma Infernum", 45);
    
    // NPCs
    Inimigo fada = new Inimigo("Grupo de Fadas Malignas", 10, 3);
    Inimigo lobo = new Inimigo("Manada de Lobos", 10, 5);
    Inimigo escorpiao = new Inimigo("Escorpião de Ardoris", 15, 5);
    Inimigo hollow = new Inimigo("Grupo de Hollows", 15, 3);
    
    // GUARDIOES
    Inimigo g1 = new Inimigo("Kvasir", 20, 10);
    Inimigo g2 = new Inimigo("Atopos", 30, 20);
    Inimigo g3 = new Inimigo("Ouroboros", 40, 30);
    Inimigo g4 = new Inimigo("Dunkelheit", 50, 40);
    
    public static int lerInt(String prompt, int userEscolhas){
        int input;
        
        // vai ler o numero de opções e vai verificar se o input é valido 
        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Por favor digite uma opção válida.");
            }
        }while(input < 1 || input > userEscolhas);
        return input;
    }
    
    public static void Clean(){
        for(int i = 0; i <= 100; i++){
            System.out.println();
        }
    }
    
    public static void separadorTexto(int n){
        for(int i = 0; i <= n; i++){
            System.out.print("-");   
        }
        System.out.println();   
    }
    
    public static void Titulo(String titulo){
        separadorTexto(30);
        System.out.println(titulo);
        separadorTexto(30);
    }
    
    public static void pressioneEnter(){
        System.out.println("Digite qualquer coisa e pressione Enter para continuar... ");
        scanner.next();
    }
    
    public void Continuar(Player jogador){
        checkAto(jogador);
    }
    
    public void checkAto(Player jogador){
        
        if(jogador.getXp()<= 10 && ato == 1 ){
            Story.atoI();
            Batalha(jogador, fada);
            
            if(isRunning == true && jogadorVenceu == true){
                
                jogadorVenceu = false;
                        
                jogador.Curar();
                jogador.getInventario().getItens().add(a1);
                Clean();
                System.out.println();
                System.out.println("Você encontrou a Biohazard!");
                System.out.println();
                pressioneEnter();

                Story.Biohazard();
                Batalha(jogador, g1);

                if(isRunning == true && jogadorVenceu == true){
                    
                    jogadorVenceu = false;
                    
                    Story.Kvasir();

                    jogador.setXp(jogador.getXp() + 10);
                    jogador.setmaxHp(jogador.getmaxHp() + 10);

                    a1.setDano(5);
                    jogador.setdano(5);
                    
                    ato = 2;
                    lugar = 1;
                    
                    Story.atoII();
                    
                }else if(isRunning == false && inimigoVenceu == true ){
                    System.out.println();
                    System.out.println("Game Over.");
                }else{
                    Menu();
                }
            }else if(isRunning == false && inimigoVenceu == true ){
                System.out.println();
                System.out.println("Game Over.");
            }else{
                Menu();
            }
            
        }else if(jogador.getXp()>= 10 && ato == 2 ){
            
            
            Batalha(jogador, lobo);
            
            if(isRunning == true && jogadorVenceu == true){
                
                jogadorVenceu = false;
                
                jogador.Curar();
                jogador.getInventario().getItens().add(a2);
                Clean();
                System.out.println();
                System.out.println("Você encontrou a Blizzard Bow!");
                System.out.println();
                pressioneEnter();

                Story.Blizzard();
                Batalha(jogador, g2);

                if(isRunning == true && jogadorVenceu == true){
                    
                    jogadorVenceu = false;
                    
                    Story.Atopos();

                    jogador.setXp(jogador.getXp() + 10);
                    jogador.setmaxHp(jogador.getmaxHp() + 10);
                    a2.setDano(5);
                    jogador.setdano(5);
                    
                    ato= 3;
                    lugar = 2;
                    
                    Story.atoIII();
                }else if(isRunning == false && inimigoVenceu == true ){
                    System.out.println();
                    System.out.println("Game Over.");
                }else{
                    Menu();
                }
            }else if(isRunning == false && inimigoVenceu == true ){
                    System.out.println();
                    System.out.println("Game Over.");
                }else{
                    Menu();
                }
            
        }else if(jogador.getXp()>= 20 && ato == 3 ){
            
            Batalha(jogador, escorpiao);
            
            if(isRunning == true && jogadorVenceu == true){
                
                jogadorVenceu = false;
                
                jogador.getInventario().getItens().add(a3);
                Clean();
                System.out.println();
                System.out.println("Você encontrou a Anthropocene!");
                System.out.println();
                pressioneEnter();

                Story.Anthropoceno();
                Batalha(jogador, g3);
                
                if(isRunning == true && jogadorVenceu == true){
                    
                    jogadorVenceu = false;
                    
                    Story.Ouroboros();

                    jogador.setXp(jogador.getXp() + 10);
                    jogador.setmaxHp(jogador.getmaxHp() + 10);

                    a3.setDano(5);
                    jogador.setdano(5);
                    
                    ato= 4;
                    lugar = 3;

                    Story.atoIV();
                }else if(isRunning == false && inimigoVenceu == true ){
                    System.out.println();
                    System.out.println("Game Over.");
                }else{
                    Menu();
                }
            }else if(isRunning == false && inimigoVenceu == true ){
                System.out.println();
                System.out.println("Game Over.");
            }else{
                Menu();
            }
        }else{
            
            Batalha(jogador, hollow);
            
            if(isRunning == true && jogadorVenceu == true){
                
                jogadorVenceu = false;
                
                jogador.getInventario().getItens().add(a4);
                Clean();
                System.out.println();
                System.out.println("Você encontrou a Magma Infernum!");
                System.out.println();
                pressioneEnter();

                Story.Magma();
                Batalha(jogador, g4);

                if(isRunning == true && jogadorVenceu == true){
                    Story.Fim();
                    isRunning = false;
                    
                }else if(isRunning == false && inimigoVenceu == true ){
                    System.out.println();
                    System.out.println("Game Over.");
                }else{
                    Menu();
                }
            }else if(isRunning == false && inimigoVenceu == true ){
                System.out.println();
                System.out.println("Game Over.");
            }else{
                Menu();
            }
        } 
    }
    
    public static void Menu(){
        Clean();
        Titulo(lugares[lugar]);
        System.out.println("(1) Continuar jornada");
        System.out.println("(2) Status do personagem");
        System.out.println("(3) Descansar");
        System.out.println("(4) Trocar arma.");
        System.out.println("(5) Sair do jogo");
        
    }
    
    public void gameLoop(Player jogador){
        
        while(isRunning){
            Menu();
            
            int input = lerInt("->", 5);
            
            if(input == 1){
                Continuar(jogador);
            }else if(input == 2){
                jogador.Info();
                pressioneEnter();
            }else if(input == 3){
                jogador.Curar();
                System.out.println();
                System.out.println("Você descansou.");
                System.out.println();
                pressioneEnter();
            }else if (input == 4){
                inventario.equiparItem(jogador);
            }else{
                isRunning = false;
            }
        }
    }
    
    public int menuBatalha(Player jogador){
        GameLogic.Titulo("Escolha uma ação: ");
        System.out.println("(1) Lutar");
        System.out.println("(2) Fugir");
        System.out.println("(3) Curar");
        System.out.println("(4) Trocar arma.");
        int input = GameLogic.lerInt("-> ", 4);
        
        return input;
    }
    
    public void Batalha(Player jogador, Inimigo inimigo){
        
        Clean();
        System.out.println(inimigo.getname() + " apareceu!");
        System.out.println("Prepare-se para a batalha!");

        while (!jogadorVenceu && !inimigoVenceu) {
            int input = menuBatalha(jogador);

            switch (input) {
                case 1:
                    int danoJogador = jogador.ataque();
                    int danoInimigo = inimigo.ataque();
                    
                    inimigo.setHp(inimigo.gethp() - danoJogador);
                    jogador.setXp(jogador.getXp()+ 1);
                    
                    System.out.println();
                    inimigo.Info();
                    System.out.println();
                    
                    System.out.println("Você atacou o " + inimigo.getname() + " e causou " + danoJogador + " de dano.\n");
                    pressioneEnter();
                    System.out.println();
                    
                    if (inimigo.gethp() <= 0) {
                        Clean();
                        System.out.println("Você derrotou o " + inimigo.getname() + "!");
                        System.out.println();
                        pressioneEnter();
                        jogadorVenceu = true;
                        break;
                    }
                    
                    jogador.setHp(jogador.gethp() - danoInimigo);
                    
                    System.out.println();
                    jogador.Info();
                    System.out.println();
                    
                    System.out.println("O " + inimigo.getname() + " atacou e causou " + danoInimigo + " de dano.\n");
                    pressioneEnter();
                    System.out.println();
                    
                    if (jogador.gethp() <= 0) {
                        Clean();
                        System.out.println("Você foi derrotado pelo " + inimigo.getname() + "...");
                        inimigoVenceu = true;
                        isRunning = false;
                    }

                    break;
                    
                case 2:
                    System.out.println("Você fugiu da batalha!");
                    pressioneEnter();
                    return;
                    
                case 3:
                    jogador.Curar();
                    System.out.println("Você usou a poção.");
                    System.out.println();
                    jogador.Info();
                    pressioneEnter();
                break;
                
                case 4:
                    inventario.equiparItem(jogador);
                break;
                
                default:
                    System.out.println("Opção inválida, escolha novamente.");
                    System.out.println();
            }
        }
    }  
}
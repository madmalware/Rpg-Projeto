/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpg;

import java.util.ArrayList;
import static rpg.GameLogic.Clean;
import static rpg.GameLogic.Titulo;
import static rpg.GameLogic.lerInt;
import static rpg.GameLogic.pressioneEnter;
import static rpg.GameLogic.scanner;
import static rpg.GameLogic.separadorTexto;

/**
 *
 * @author Mad Malware
 */
public class Rpg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        GameLogic game = new GameLogic();
        boolean nameset = false;
        String name;

        separadorTexto(30);
        System.out.println("\tDOOMED SOUL");
        separadorTexto(30);
        pressioneEnter();

        do {
            Clean();
            Titulo("Qual sera seu nome? ");
            name = scanner.next();

            Clean();
            Titulo("Seu nome é " + name + ". \nCorreto? ");
            System.out.println("(1) Sim.");
            System.out.println("(2) Não. Eu quero mudar meu nome.");
            int input = lerInt("-> ", 2);
            if (input == 1) {
                nameset = true;
            }

        } while (!nameset);

        Player jogador = new Player();
        jogador.setName(name);

        Item espadaSimples = new Item("Espada de ferro", 5);

        jogador.getInventario().getItens().add(espadaSimples);
        jogador.getInventario().getItens().get(0).setEquipado(true);
        
        Story.Intro();
        
        Clean();
        System.out.println("\nVocê recebeu uma Espada Simples para iniciar sua jornada.\n");
        pressioneEnter();

        game.gameLoop(jogador);

    }

}
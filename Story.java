/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;


import static rpg.GameLogic.pressioneEnter;

public class Story {
   
    public static void Intro(){
        GameLogic.Clean();
        GameLogic.separadorTexto(55);
        System.out.println("INTRO: A DOR DA PERDA & INICIO À JORNADA DO DESESPERO");
        GameLogic.separadorTexto(55);
        System.out.println("Havia um homem cujo coração estava envolto em trevas profundas.");
        System.out.println("Sua amada esposa havia partido, vítima de uma doença misteriosa que a arrancou de seus braços em um piscar de olhos.");
        System.out.println("Ele sofria em silêncio, atormentado pela dor da perda.");
        System.out.println();
        System.out.println("A esposa, uma pesquisadora dedicada, passara anos imersa em estudos sobre religiões, tradições e rituais ocultos.");
        System.out.println("Seu conhecimento transcendia a compreensão comum, e suas anotações eram um testemunho de seu profundo interesse pelo desconhecido.\n");
        pressioneEnter();
        GameLogic.Clean();
        System.out.println();
        System.out.println("Após a partida de sua amada, você mergulhou nas pesquisas de sua esposa,");
        System.out.println("buscando desesperadamente encontrar uma maneira de trazê-la de volta à vida.");
        System.out.println();
        System.out.println("No entanto, a resposta estava além do que qualquer um poderia imaginar.");
        System.out.println("Você descobriu a existência de uma entidade chamada Dunkelheit que controlava as almas dos vivos e dos mortos.");
        System.out.println("Essa entidade ofereceu-lhe um acordo extraordinário: a alma de sua esposa em troca de 3 objetos misteriosos, cada um protegido por um guardião no plano físico.\n");
        System.out.println("Missão: Derrote cada guardião, consiga os 3 objetos e entregue-os para Dunkelheit.\n");
        pressioneEnter();
    }
    
    public static void atoI(){
        GameLogic.Clean();
        GameLogic.separadorTexto(30);
        System.out.println("ATO I - MIDSOMMAR");
        GameLogic.separadorTexto(30);
        System.out.println("Você iniciou sua jornada e chegou a Midsommar, o lugar onde nunca é noite.");
        System.out.println("Aqui reside o guardião da criação chamado Kvasir.");
        System.out.println();
        System.out.println("Kvasir tem a forma de um urso pardo gigante.");
        System.out.println("Seu rugido é tão ensurdecedor que faz a terra tremer.");
        System.out.println("Suas garras afiadas brilham com uma energia divina,");
        System.out.println("e sua pele é incrivelmente resistente a qualquer ataque.");
        System.out.println("A vegetação exuberante de Midsommar parece enraizada na sua força,");
        System.out.println("tornando-o ainda mais formidável.\n");
        pressioneEnter();
        GameLogic.Clean();
        System.out.println("O rumor sobre a localização da arma que pode matá-lo, a espada Biohazard, diz que ela");
        System.out.println("está em bosque escuro e misterioso dentro de Midsommar onde as fadas habitam.");
        System.out.println("Estas fadas são belas, possuem asas brilhantes que brilham como luz da lua,");
        System.out.println("porém, são violentas, carnívoras, criaturas traiçoeiras famintas por sangue...");
        System.out.println();
        System.out.println("Tarefa: Derrote as Fadas e pegue a Biohazard.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void Biohazard(){
        GameLogic.Clean();
        System.out.println();
        System.out.println("Você derrotou as fadas e pegou a espada Biohazard!");
        System.out.println("Agora vá atrás do Guardião Kvasir e derrote-o.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void Kvasir(){
        GameLogic.Clean();
        System.out.println();
        System.out.println("Você derrotou o Guardião Kvasir e pegou a joia da criação!");
        System.out.println("Agora vá para as Montanhas de Nix e derrote o Guardião Atopos.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void atoII(){
        GameLogic.Clean();
        GameLogic.separadorTexto(30);
        System.out.println("ATO II - NIX");
        GameLogic.separadorTexto(30);
        System.out.println("Você chegou às Montanhas Nix.");
        System.out.println("Aqui reside o guardião do caos, Atopos.");
        System.out.println();
        System.out.println("À medida que você se aproxima ao topo das gélidas Montanhas Nix, a presença do Guardião");
        System.out.println(" Atopos, paira sobre você como uma sombra imponente.");
        System.out.println("No topo da montanha, ele aguardava em sua forma majestosa de uma gigante coruja das neves de 5 olhos.");
        System.out.println("Suas asas se estendiam vastas e brancas, e seus olhos penetrantes examinavam cada movimento.");
        System.out.println();
        System.out.println("A arma que pode derrotá-lo, a Blizzard Bow, também reside em Nix,");
        System.out.println("mas para chegar até ela, você precisa enfrentar manadas de lobos que circundam a região.\n");
        System.out.println("Tarefa: Derrote os Lobos de Nix e pegue a Blizzard Bow.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void Blizzard(){
        GameLogic.Clean();
        System.out.println();
        System.out.println("Você derrotou os lobos e pegou o arco Blizzard Bow!");
        System.out.println("Agora vá atrás do Guardião Atopos e derrote-o.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void Atopos(){
        GameLogic.Clean();
        System.out.println();
        System.out.println("Você derrotou o Guardião Atopos e pegou a joia do Caos!");
        System.out.println("Agora vá para o Deserto de Ardoris e derrote o Guardião Ouroboros.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void atoIII(){
        GameLogic.Clean();
        GameLogic.separadorTexto(30);
        System.out.println("ATO III - ARDORIS");
        GameLogic.separadorTexto(30);
        System.out.println("Você chegou ao deserto Ardoris.");
        System.out.println("Aqui reside o guardião do equilíbrio, Ouroboros.");
        System.out.println("Este guardião assume a forma de uma gigante naja de três cabeças, cada uma representando um \naspecto diferente do equilíbrio: passado, presente e futuro.");
        System.out.println();
        System.out.println("A arma mágica necessária para derrotar Ouroboros é conhecida como Anthropocene.");
        System.out.println("Esta espada tem a capacidade única de cortar através das camadas do tempo e da realidade, ");
        System.out.println("tornando-a a única arma capaz de enfrentar o Guardião do Equilíbrio.");
        System.out.println("Mas para obte-la você precisa derrotar os escorpiões venenosos do deserto Ardoris.\n");
        System.out.println("Tarefa: Derrote os Escorpiões de Ardoris e pegue a Anthropocene.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void Anthropoceno(){
        GameLogic.Clean();
        System.out.println();
        System.out.println("Você derrotou os escorpiões e pegou a espada Anthropocene!");
        System.out.println("Agora vá atrás do Guardião Ouroboros e derrote-o.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void Ouroboros(){
        GameLogic.Clean();
        GameLogic.separadorTexto(30);
        System.out.println("ATO III - A DESCOBERTA");
        GameLogic.separadorTexto(30);
        System.out.println();
        System.out.println("Após a árdua batalha e a derrota de Ouroboros,");
        System.out.println("seu olhar foi atraído para a imensa tumba onde a colossal serpente residia.");
        System.out.println("Entre os escombros e destroços, você avistou um livro que imediatamente o remeteu aos grimórios que sua falecida esposa possuía.");
        System.out.println("Sua capa enigmática e as páginas antigas sussurravam segredos ancestrais.");
        System.out.println();
        System.out.println("Sem hesitação, você folheou o livro, cujas páginas continham um conhecimento inestimável sobre as pedras que você havia reunido.");
        System.out.println("Ali estavam registrados feitiços de grande poder, incluindo a misteriosa arte da necromancia.");
        System.out.println("Foi então que uma verdade incrível se revelou: você não precisava mais de Dunkelheit para trazer sua amada de volta.");
        System.out.println("Você agora tem em mãos o potencial para realizá-lo sozinho.");
        System.out.println();
        pressioneEnter();
        GameLogic.Clean();
        System.out.println();
        System.out.println("Você derrotou o Guardião Ouroboros e pegou a joia do Equílibrio!");
        System.out.println("Agora vá para a Caverna Tenebris e derrote o Guardião Dunkelheit.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void atoIV(){
        GameLogic.Clean();
        GameLogic.separadorTexto(30);
        System.out.println("ATO IV - TENEBRIS");
        GameLogic.separadorTexto(30);
        System.out.println("Você chegou a Tenebris, as ruinas de uma antiga cidade localizada em uma escura e profunda caverna.");
        System.out.println("Aqui vive Dunkelheit. Sua figura assemelha-se a um morcego gigante,");
        System.out.println("suas asas negras absorvem a luz audaciosa que ousa tocá-las.");
        System.out.println("Seus olhos, vermelhos como rubis, brilham intensamente na escuridão abissal que o envolve.");
        System.out.println();
        System.out.println("As lendas sobre a Magma Infernum, a única arma capaz de pôr fim a Dunkelheit,");
        System.out.println("sugeriam que ela está em uma gruta escura e úmida, escondida em algum recanto das vastas profundezas da caverna de Tenebris.");
        System.out.println("Contudo, para alcançá-la, é preciso enfrentar os temidos Hollows.");
        System.out.println();
        System.out.println("Os Hollows são criaturas cujas almas haviam sido roubadas, deixando apenas corpos vazios a vagar em busca de algo que nunca mais teriam.");
        System.out.println("Assemelham-se a zumbis, atraídos por uma ânsia insaciável de devorar qualquer ser que possuísse aquilo que eles perderam: uma alma.\n");
        System.out.println("Tarefa: Derrote os Hollows e pegue a Magma Infernum.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void Magma(){
        GameLogic.Clean();
        System.out.println();
        System.out.println("Você derrotou os Hollows e pegou o machado flamejante Magma Infernum!");
        System.out.println("Agora vá atrás do Guardião Dunkelheit e derrote-o.");
        System.out.println();
        pressioneEnter();
    }
    
    public static void Fim(){
        GameLogic.Clean();
        GameLogic.separadorTexto(30);
        System.out.println("FIM - A PUNIÇÃO DO BERSERKER ");
        GameLogic.separadorTexto(30);
        System.out.println("Com o conhecimento adquirido no livro e o poder das pedras, você pode realizar o ritual para trazer");
        System.out.println("sua esposa de volta à vida. O vínculo quebrado pela morte começou a se recompor, e ela retornou ao mundo dos vivos.");
        System.out.println();
        System.out.println("No entanto, havia uma reviravolta nessa conquista. O uso desses poderes para benefício próprio não passou");
        System.out.println("despercebido pelas leis do universo. O equilíbrio cósmico sempre exigia um preço, e agora você estava destinado");
        System.out.println("a pagá-lo.");
        System.out.println();
        System.out.println("Você foi encarregado de guardar as 4 jóias pela eternidade. Sua esposa retornou, mas agora,");
        System.out.println("a sua alma estava presa para sempre em Tenebris, no corpo de uma colossal e poderosa besta.");
        System.out.println("Você havia se tornado um ser superior.");
        System.out.println("Você e a mulher que costumava ser sua esposa estavam destinados a trilhar caminhos separados...");
        System.out.println();
        pressioneEnter();
        GameLogic.Clean();
        System.out.println("FIM.");
        System.out.println();
        System.out.println("TRABALHO POR: MARIA EDUARDA E NATAN.");

    }
    
}

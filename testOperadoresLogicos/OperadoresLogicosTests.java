package OperadoresLogicos;

public class OperadoresLogicosTests {

    // desafio proposto pelo curso: "Qual TV a familia do programador ira comprar";
    // trabalho 1 e trabalho 2
    // se os dois trabalhos derem certo, a familia ira comprar uma TV de 50 polegadas;
    // se apenas um trabalho der certo, a familia ira compra uma TV de 32 polegadas;
    // nos dois casos, a familia ira tomar sorvete;
    // agora, se os dois trabalhos derem errado ficaremos em casa sem a TV;
    // se a familia tomar sorvete, a vida da familia sera menos saudavel;
    // se a familia não tomar sorvete, a vida  da familia sera mais saudavel;

        static void main(String[] args) {

        boolean trabalho1 = !true;
        boolean trabalho2 = !true;
        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean sorvete = trabalho1 || trabalho2;

            System.out.println("/nPossibilidade para a familia do programador:");
            System.out.println("Trabalho 1 deu certo? ");
            System.out.println(trabalho1);
            System.out.println("Trabalho 2 deu certo? ");
            System.out.println(trabalho2);
            System.out.println("Então: Os dois trabalhos deram certo?");
            System.out.println(trabalho1 && trabalho2);
            System.out.println("A TV comprada foi a de 50 polegadas?");
            System.out.println(tv50);
            System.out.println("A TV comprada foi a de 30 polegadas?");
            System.out.println(tv32);
            System.out.println("A familia foi tomar sorvete?");
            System.out.println(sorvete);
        }
    }
import java.util.Scanner;
//import javax.sound.sampled.*;
//import java.net.URL;

public class HistoriaAntiga{
    public static void printLinha(String text) {
        int tamanho =  text.length();
        String linha = "";
        for (int i = 0; i < tamanho; i++){
        linha += "-";
        }
        System.out.println(linha);
        }
    
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    HistoriaPersonagem personagem = new HistoriaPersonagem();
    // * Atributos*
    personagem.nome = "Emily";
    personagem.energia = 100;
    // *Métodos*
    
    //* Inicio da Historia | Capitulo 1 | */

    HistoriaAntiga.printLinha("Bem vindo caro jogador, você esta prestes a se aventurar em uma historia arrepiante (ou nao tao arrepiante assim, depende da sua coragem ;) o que eu estou pres");
    System.out.println("Bem vindo caro jogador, você esta prestes a se aventurar em uma historia arrepiante (ou nao tao arrepiante assim, depende da sua coragem ;) o que eu estou prestes a mostrar para você é a historia de uma menina muito corajosa cujo o nome é Emily ");
    System.out.print("Você quer continuar na história? (sim/nao)");
    String resp = ler.nextLine();

    if (resp.equalsIgnoreCase("sim")) {
        // O usuário quer continuar na história
        System.out.println("Vejo que você é corajoso o suficiente.");
        System.out.println("Emily estava cuidando da casa da sua amiga Carla, essa que estava viajando a trabalho, ela ia passar um mês fora, e não queria que sua casa ficasse desprotegida, nesse meio periodo.");
        System.out.println("A noite estava escura e tempestuosa, com relâmpagos rasgando o céu negro e trovões ecoando pela pequena cidade.\n Emily estava sozinha na casa da sua velha amiga,\n uma construção de madeira que rangia com o vento. Ela sempre soube que havia algo errado com aquela casa, nunca entendeu o por que de sua amiga ainda morar em uma casa que parecia ter parado no tempo. A casa vitoriana parecia estar caindo aos pedaços.");
        System.out.println("Enquanto Emily se aconchegava no sofá, tentando se distrair com um livro, ouviu um barulho alto no andar de cima. ");
        System.out.println(">>>");
        System.out.println("O que você vai fazer? Você tem 3 opções:\n 1 | verificar o que pode ser | \n 2 |fingir naturalidade| \n 3 |correr|");
        int resposta1 = ler.nextInt();
            if (resposta1 == 1){
                HistoriaAntiga.printLinha("Emily sentiu seu coração acelerar e aquele suor frio, com o pouco de coragem que ainda tinha, subiu as escadas");
                System.out.println("Emily sentiu seu coração acelerar e aquele suor frio, com o pouco de coragem que ainda tinha, subiu as escadas. Abriu a primeira porta do quarto, onde o barulho poderia ter vindo dali.\n Quando Emily abriu a porta, so o suficiente para olhar o comodo, não tinha nada que pudesse ter causado o barulho. Então ela fechou a porta e desceu as escadas rumo a sala.  ");}
            else if (resposta1 == 2){
                HistoriaAntiga.printLinha("Emily continuou lendo o livro, estava em uma parte muito boa da historia e não ia ser um barulinho qualquer que ia tirar o foco dela. O barulho se repete outr ");
                System.out.println("Emily continuou lendo o livro, estava em uma parte muito boa da historia e não ia ser um barulinho qualquer que ia tirar o foco dela. \n O barulho se repete outra vez. Emily decide olhar de uma vez por todas o que é esse barulho terrivel que esta atrapalhando a leitura dela.\n Subiu as escadas e abriu a primeira porta do quarto, onde o barulho poderia ter vindo dali. Quando Emily abriu a porta, não tinha nada que pudesse ter causado o barulho. Irritada Emily desceu as escadas marchando, ela odiava ser atrapalhada quando estava lendo.    ");
                }
            else if (resposta1 == 3) {
                HistoriaAntiga.printLinha("Ceús você é medroso mesmo eim, não tem motivos para se acorvadar, você pode confiar em mim, agora continue jogando. Fracos são aqueles que não tem determinaç");
                System.out.println("Ceús você é medroso mesmo eim, não tem motivos para se acorvadar,você pode confiar em mim, agora continue jogando. \' Fracos são aqueles que não tem determinação para seguir em frente \'");}
            else {
                System.out.println("Desculpe, eu não entendi. Por favor, responda com os números 1,2,3.");}}
                
    
    
    
    
    
    
    
                else if (resp.equalsIgnoreCase("nao")) {
        // O usuário não quer continuar na história
        System.out.println("Não me diga que voce esta com medo ?! Um verdadeiro frango");
    }
    else {
        // O usuário digitou algo diferente de "sim" ou "não"
        System.out.println("Desculpe, eu não entendi. Por favor, responda com 'sim' ou 'não'.");
    }
}
}

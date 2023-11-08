import java.util.Scanner;
<<<<<<< Updated upstream
//import javax.sound.sampled.*;
//import java.net.URL;
public class Capitulo1 {
    HistoriaPersonagem objeto = new HistoriaPersonagem();
=======

public class Capitulo1 {
    
>>>>>>> Stashed changes
    private String nome;
    private String texto;
    private String escolha1;
    private String escolha2;
<<<<<<< Updated upstream
    private int energia;


    public int getEnergia() {
        return energia;
        
    }





    public Capitulo1(String nome, String texto, String escolha1, String escolha2, int energia) {
        this.nome = nome; // Vai receber o titulo do capitulo da historia
        this.texto = texto; // vai receber o texto da historia 
        this.escolha1 = escolha1; 
        this.escolha2 = escolha2;
        this.energia = energia; // vai receber a energia total do personagem de acordo com o capitulo
    }
    
    public void mostrar(){
        if (escolha1 == 1){
        Historia.printLinha("Quando Emily abriu a porta, so o suficiente para olhar o comodo, não tinha nada que pudesse ter causado o barulho. Então ela fechou a porta e desceu as escadas rumo a sala. Quando Emily chega na sala, ela percebe que");   
        System.out.println("Quando Emily abriu a porta, so o suficiente para olhar o comodo, não tinha nada que pudesse ter causado o barulho. Então ela fechou a porta e desceu as escadas rumo a sala. Quando Emily chega na sala, ela percebe que seu livro sumiu. \n \'Que estranho eu me lembro de ter deixado meu livro aqui. \' \nUm barulho de panela caindo vem da cozinha, Emily se vira em direção a cozinha procurando o motivo do barulho, ela caminha em direção a mesma e quando chega na cozinha ve a panela de pressão jogada no chão, mas não tinha nenhum indicio que alguem esteve ali, as portas e janelas estavam fechadas por causa da chuva. Emily pegou a panela jogada   "); }
    }
    
    
    
    
    
=======
    private int alteracaoEnergia;
    private Scanner lerEntrada;

    // Construtor

    public Capitulo1(String nome, String texto, String escolha1,String escolha2,int alteracaoEnergia, Scanner lerEntrada) {
        this.nome = nome; // Vai receber o titulo do capitulo da historia
        this.texto = texto; // vai receber o texto da historia
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.alteracaoEnergia = alteracaoEnergia;
        this.lerEntrada = lerEntrada;

    }
    
    // Metodo para mostrar as informacoes do capitulo para o usuario
    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println(texto);
        System.out.println("Escolha 1: Emily acaba presa no sótão, e vai ter que achar uma maneira de sair dele " + escolha1);
        System.out.println("Escolha 2: Emily acaba presa no sótão, e vai ter que achar uma maneira de sair do labirinto " + escolha2);
    }
    
    // Método para fazer uma escolha
    public int escolha(){
        int e = 0;
        while (e != 1 && e != 2) {
            System.out.println("Escolha qual caminho voce vai seguir 1 ou 2? ");
            e = lerEntrada.nextInt();
        } return e;
}
>>>>>>> Stashed changes
    
    
    
    public static void main(String[] args) {
<<<<<<< Updated upstream
        HistoriaPersonagem objeto = new HistoriaPersonagem();
        Historia.printLinha("Bem vindo ao Capítulo 1!");
        System.out.println("Bem vindo ao Capitulo 1");
        
=======
        Scanner ler = new Scanner(System.in);
        // Criação dos objetos capitulos
        Capitulo1 c1 = new Capitulo1("Capitulo 1", "", "Escolha 1","",-10, ler);
        Capitulo1 c2 = new Capitulo1("Capitulo 2", "b", "","Escolha 2",-13, ler);
        
        HistoriaPersonagem objeto = new HistoriaPersonagem();
        Historia funcao = new Historia();
        
        // Exibir o capitulo
        c1.mostrar(); // Chamando o metodo mostrar dentro do objeto
        int escolher = c1.escolha();
        
        if (escolher == 1) {
            Historia.printLinha("Quando Emily abriu a porta, so o suficiente para olhar o comodo, não tinha nada que pudesse ter causado o barulho. Então");
            System.out.println("Quando Emily abriu a porta, so o suficiente para olhar o comodo, não tinha nada que pudesse ter causado o barulho. Então ela fechou a porta e desceu as escadas rumo a sala. Chegando na sala ela escuta um barulho de passos vindo do sótão,decidida em acabar de uma vez com esse barulho misterioso.");

            System.out.println("Emily caminha ate o sótão, abrindo a porta ela se depara com o lugar mal iluminado e um cheiro esquisito \'-- Carla deveria limpar esse lugar esse cheiro ta hórrivel\' Emily percebeu que os passos haviam cessados, mas então ouviu um sussurro vindo do fundo do corredor.\n Como se fosse um gato ferido, ela seguiu o barulho e encontrou uma porta velha de ferro com vidros escuros.\'-- O barulho esta vindo daqui\'. Emily consegue abrir a porta o suficiente para passar o seu corpo. Foi quando ela se deparou com uma visão que a fez congelar de terror, havia ossos espalhados pelo chão e um cheiro horrivel de algo podre. \'-- Ah meu deus !\' \n Telefone de Emily toca \'\n- Alô? \n - Emily o que você fez... Não deveria ter descido até o sótão, você está correndo um grande perigo\' ");
        }
        else if (escolher == 2){
        }
>>>>>>> Stashed changes
    }
}

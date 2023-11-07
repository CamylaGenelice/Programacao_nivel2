import java.util.Scanner;
//import javax.sound.sampled.*;
//import java.net.URL;
public class Capitulo1 {
    HistoriaPersonagem objeto = new HistoriaPersonagem();
    private String nome;
    private String texto;
    private String escolha1;
    private String escolha2;
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
        if (){
        System.out.println("Quando Emily abriu a porta, so o suficiente para olhar o comodo, não tinha nada que pudesse ter causado o barulho. Então ela fechou a porta e desceu as escadas rumo a sala. Quando Emily chega na sala, ela percebe que seu livro sumiu. \n \'Que estranho eu me lembro de ter deixado meu livro aqui. \'  "); }
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        HistoriaPersonagem objeto = new HistoriaPersonagem();
        Historia.printLinha("Bem vindo ao Capítulo 1!");
        System.out.println("Bem vindo ao Capitulo 1");
        
    }
}

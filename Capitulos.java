import java.util.Scanner;
import java.util.Arrays;
public class Capitulos {
    // Atributos
    private String nomeDoCapitulo; // Nome do capitulo
    private String texto; // O que vai acontecer no capitulo
    private String escolha1; // escolha
    private String escolha2;
    private String finalCa;
    private Personagem personagem; // O nome do de alguma coisa
    private int alteracaoEnergia;
    private Scanner ler;
    


    public Capitulos(String nomeDoCapitulo, String texto, String escolha1, String escolha2, Personagem personagem, int alteracaoEnergia, Scanner ler) {
        this.nomeDoCapitulo = nomeDoCapitulo;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.ler = ler;
        
    }



public int comparador() {
    int res = 0;
    while (res != 1 && res !=2) {
        System.out.println("Escolha qual caminho voce quer seguir | 1 ou 2 |: ");
        res = ler.nextInt();
    }
    if (res == 0) {
        System.out.println("Não entendi o que você digitou");
    }
    return res;
    }



}
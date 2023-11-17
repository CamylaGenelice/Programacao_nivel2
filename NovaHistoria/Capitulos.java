import java.util.Scanner;

public class Capitulos {
    // Atributos
    private String nome; // Nome do capitulo
    private String texto; // O que vai acontecer no capitulo
    private String escolha1; // escolha
    private String escolha2;
    private String finalCa;
    private Personagem personagem; // O nome do de alguma coisa
    private int alteracaoEnergia;
    private Scanner ler;
    String [] escolhas;


    public Capitulos(String nome, String texto, String escolha1, String escolha2, Personagem personagem, int alteracaoEnergia, Scanner ler) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.ler = ler;
        
    }

public void mostrar(){
    System.out.println("" + nome);
    System.out.println(texto);
    escolhas[0] = escolha1;
    escolhas [1] = escolha2;
    System.out.println(escolhas[0]);
    System.out.println(escolhas[1]);
    System.out.println("Sua vida" + alteracaoEnergia);}

public int comparador() {
    int res = 0;
    while (res != 1 && res !=2) {
        System.out.println("Escolha qual caminho voce quer seguir | 1 ou 2 |: ");
        res = ler.nextInt();
    }
    if (res == 0) {
    
    }
    return res;
    }



}
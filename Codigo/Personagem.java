package Codigo;
import java.util.Scanner;
public class Personagem {
    Scanner entradScanner = new Scanner(System.in);
    // Atributos do personagem
    String nome;
    String modelo;
    int ano;
    int acelerar;
    int frear;
    int vida;
    // Construtor
    public Personagem(String nome, String modelo, int ano){
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        
    }
    public String getNome() {
        return this.nome;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAno() {
        return this.ano;
    }
    


    public Personagem(int acelerar, int frear, int vida ) {
        this.acelerar = acelerar;
        this.frear = frear;
        this.vida = vida;

    }

    
    
}
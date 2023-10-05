import java.util.Scanner;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;


public class teste {

public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

// **Inicio do código**

System.out.println("Blue Seguro Veicular");
System.out.println("----------------------------------");
System.out.print("Seja Bem Vindo! Eu me chamo Azul :) Como você se chama? ");
String nomeDaconversa = ler.nextLine(); // Aqui o usuário vai informar algum nome que ele deseja ser chamado

// ** Inicio da coleta de dados do usuário **

System.out.printf("É um prazer conversar com você %s, eu vou ajudar você com a cotação do seu carro. E para dar inicio ao processo informe o seu nome completo e sua idade abaixo ",nomeDaconversa);
System.out.println("");
System.out.print("nome: ");
String nomeCompleto = ler.nextLine();
System.out.print("idade: ");
int idade = ler.nextInt();

// ** Fim da coleta de dados **

// ** Inicio das frases personalizadas **

if (idade >= 18 && idade < 24){
        System.out.printf("%s anos você está na flor da idade kkkk",idade);

}
else {
        System.out.printf("%s anos você já alguns anos de experiencia em :)",idade);
}
// ** Fim das frases personalizadas **

}

} // ** Fim do código**
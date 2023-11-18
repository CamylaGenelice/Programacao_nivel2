import java.util.Arrays;
import java.util.Scanner;
public class Historia {
    
    // Funções do codigo
    
    public static void Linhas(){
        int tamanho = 130;
        String ifen = "";
        for (int i = 0; i < tamanho; i++){
        ifen += "-";
        
        }
        System.out.println(ifen);
    }

    static void mostrar(String titulo, String text, String [] escolhas  ){
        System.out.println(" " + titulo);
        System.out.println(" " + text);
        for (String escolha : escolhas){
        System.out.println(" " + escolha);}
        };

        public static int comparador() {
            Scanner ler = new Scanner(System.in);
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
    // Fim das funções
    
    private static String nome;
    
    
    public static void main(String[] args){
        //Historia ifen = new Historia();
        Scanner ler = new Scanner(System.in);
        Personagem obPersonagem = new Personagem(0,0,100);
        //String[] escolhas = {"Escolha 1", "Escolha 2"};
        //Capitulos ar = new Capitulos(escolhas);
        


        System.out.println("Digite o nome do carro:");
        String n = ler.nextLine();
        System.out.println("Digite o modelo do carro:");
        String m = ler.nextLine();
        System.out.println("Digite o ano do carro:");
        int a = ler.nextInt();
        Personagem objNome = new Personagem(n,m,a);
        Historia.Linhas();
        System.out.printf(" o nome do seu carro: " + objNome.getNome() + ", o modelo: " + objNome.getModelo() + ",  ano dele: " + objNome.getAno());
        System.out.println("");
        Historia.Linhas();

        // INICIO DA HISTORIA
        System.out.println("Ola jovem  "  + objNome.getNome() + " meu nome é Blue, eu serei sua assistente virtual durante essa temporada, é um prazer trabalhar com você!. Você esta prestes a entrar em uma corrida fórmula 1, onde tudo pode acontecer, você vai ter que fazer varias escolhas durante essa jornada, então saiba escolher bem. ");
        System.out.println("|ATENÇÃO CORREDORES, EM 10 MINUTOS A CORRIDA VAI COMEÇAR! | \n Acho que essa é a sua deixa " + objNome.getNome() + " vamos preparar você para a corrida.");
        Historia.Linhas();
        Capitulos capitulo1 = new Capitulos(" Capitulo 1: A primeira corrida", "Formação de Grid: 10.º Carla Hansen, 9.º Fernando Alonso, 8.º Sergio Perez, 7.º Camyla Santos, 6.º Beatriz DiSantos, 5.º Lewis Hamilton,  4.º Lana Del Rey, 3.º " + objNome.getNome()+ ", 2.º TurboThunder, 1.º Relâmpago McQueen \n 5...4...3...2...1 \n |FOI DADA A LARGADA E OS CORREDORES JÁ ESTÃO NA PISTA| Narradores: temos novos corredores estreando hoje, como o nosso querido "+ objNome.getNome()+ " o novato parece que começou bem começar na 3 posição é um bom começo. \n " + objNome.getNome() +" \'Blue: Essa pista tem muitas curvas fechadas, você vai ter que ter cuidado para não abrir demais quando for fazer a volta, a Lana tem especialidade em curvas fechadas, se você se descuidar ela te ultrapassa. Nesse primeiro momento da corrida se concentre em manter a sua posição, para que o pneu não desgaste antes da 20.º volta.  \' \n |12.º volta| Narradores: parece que a Lana Del Rey esta chegando com tudo em cima do "+ objNome.getNome() +" é a Lana não brinca em serviço, ela está quase alcançando "+ objNome.getNome() +"que esta na frente por 6 segundos, MAS NÃO POR MUITO TEMPO! A LANA DEL REY DIMINUIU O TEMPO, ELA FEZ A VOLTA MAIS RÁPIDA DA CORRIDA ATÉ AGORA! Se ela continuar assim vai chegar rapidinho no "+ objNome.getNome() +  " a mulher não tá para brincadeira hehehe. \n \'Blue: Tenha cuidado nessa volta 69, fique de olho na sua retaguarda, a Lana deve tentar ultrapassar você nessa volta.\' Narradores: chegamos na tão temida volta 69, e já temos movimentação por aqui, Camyla Santos está tentando ultrapassar a DiSantos, e parece que está conseguindo! Ela está fechando a DiSantos na volta,Beatriz DiSantos não tem escolhas e deixa Camyla passar ! Uma manobra e tanto. \n |13.º volta| Narradores: Estamos agora na volta 13.º e Lana Del Rey vem se aproximando com tudo para cima de " + objNome.getNome() + "Decida o que você vai fazer "+ objNome.getNome(),"|Escolha 1| Não deixar Lana Del Rey passar", "|Escolha 2| Deixar Lana Del Rey passar",objNome, 0, ler);

        mostrar("Capitulo 1: A primeira corrida", "Formação de Grid: 10.º Carla Hansen, 9.º Fernando Alonso, 8.º Sergio Perez, 7.º Camyla Santos, 6.º Beatriz DiSantos, 5.º Lewis Hamilton,  4.º Lana Del Rey, 3.º " + objNome.getNome()+ ", 2.º TurboThunder, 1.º Relâmpago McQueen \n 5...4...3...2...1 \n |FOI DADA A LARGADA E OS CORREDORES JÁ ESTÃO NA PISTA| Narradores: temos novos corredores estreando hoje, como o nosso querido "+ objNome.getNome()+ " o novato parece que começou bem começar na 3 posição é um bom começo. \n " + objNome.getNome() +" \'Blue: Essa pista tem muitas curvas fechadas, você vai ter que ter cuidado para não abrir demais quando for fazer a volta, a Lana tem especialidade em curvas fechadas, se você se descuidar ela te ultrapassa. Nesse primeiro momento da corrida se concentre em manter a sua posição, para que o pneu não desgaste antes da 20.º volta.  \' \n |12.º volta| Narradores: parece que a Lana Del Rey esta chegando com tudo em cima do "+ objNome.getNome() +" é a Lana não brinca em serviço, ela está quase alcançando "+ objNome.getNome() +"que esta na frente por 6 segundos, MAS NÃO POR MUITO TEMPO! A LANA DEL REY DIMINUIU O TEMPO, ELA FEZ A VOLTA MAIS RÁPIDA DA CORRIDA ATÉ AGORA! Se ela continuar assim vai chegar rapidinho no "+ objNome.getNome() +  " a mulher não tá para brincadeira hehehe. \n \'Blue: Tenha cuidado nessa volta 69, fique de olho na sua retaguarda, a Lana deve tentar ultrapassar você nessa volta.\' Narradores: chegamos na tão temida volta 69, e já temos movimentação por aqui, Camyla Santos está tentando ultrapassar a DiSantos, e parece que está conseguindo! Ela está fechando a DiSantos na volta,Beatriz DiSantos não tem escolhas e deixa Camyla passar ! Uma manobra e tanto. \n |13.º volta| Narradores: Estamos agora na volta 13.º e Lana Del Rey vem se aproximando com tudo para cima de " + objNome.getNome()+ "\n \\ Decida o que você quer fazer \\" ,new String[] {"|Escolha 1| Não deixar Lana Del Rey passar", "|Escolha 2| Deixar Lana Del Rey passar"});
        String esco = ler.nextLine();
        Historia.Linhas();
        Historia.comparador();
        
    }

    
    
}



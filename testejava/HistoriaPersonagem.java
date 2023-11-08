public class HistoriaPersonagem {
    
    // *Atributos da Emily*
    public static int vitalidade = 100;
    public String nome = "Emily";
    // *Métodos*
    void seEsconder(){
        System.out.println("....");
    }
    void acenderLanterna(){
        System.out.println("|Lanterna ligada| ------<");
    }
    void apagarLanterna(){
        System.out.println(" |Lanterna desligada | -----0");
    }
<<<<<<< Updated upstream

=======
    void correr(){
    System.out.println("웃_____ ");
    }
<<<<<<< Updated upstream
    public class TesteHistoria{
    public static void main(String[] args){
        
=======
>>>>>>> Stashed changes
     // Atributos do killer
    int visao = 100;

    // *Métodos do killer *
    void andar (){
<<<<<<< Updated upstream
        System.out.println("rew rew rew...");
=======
        System.out.println("(@ _ @)");
>>>>>>> Stashed changes
    }
    static int dano = 0;
    public static void assustar() {
        if (vitalidade >= 10) {
            vitalidade -= 10;
            dano = vitalidade;
<<<<<<< Updated upstream
            System.out.println("Você foi assustado e perdeu 10 pontos de vitalidade. Vitalidade atual: " + dano);
=======
            System.out.println("Você foi assustado e perdeu 10 pontos de vitalidade (ㆆ_ㆆ). Vitalidade atual: " + dano);
>>>>>>> Stashed changes
            //System.out.println("oi"+dano);
        }
}
    public static void main(String[] args){
<<<<<<< Updated upstream
        System.out.println("Vitalidade antes de ser assustado: " + vitalidade);
        assustar();
        System.out.println("Vitalidade depois de ser assustado: " + vitalidade);
=======
        HistoriaPersonagem ob = new HistoriaPersonagem();
        System.out.println("Vitalidade antes de ser assustado: " + vitalidade);
        assustar();
        System.out.println("Vitalidade depois de ser assustado: " + vitalidade);
        ob.andar();
>>>>>>> Stashed changes
>>>>>>> Stashed changes
    }

}



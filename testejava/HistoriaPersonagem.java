public class HistoriaPersonagem {
    
    // *Atributos da Emily*
    public static int vitalidade = 100;
    public String nome = "Emily";
    // *Métodos*
    void seEsconder(){
        System.out.println("....");
    }
    void acenderLanterna(){
        System.out.println("----<");
    }
    void apagarLanterna(){
        System.out.println("----0");
    }

     // Atributos do killer
    int visao = 100;

    // *Métodos do killer *
    void andar (){
        System.out.println("rew rew rew...");
    }
    static int dano = 0;
    public static void assustar() {
        if (vitalidade >= 10) {
            vitalidade -= 10;
            dano = vitalidade;
            System.out.println("Você foi assustado e perdeu 10 pontos de vitalidade. Vitalidade atual: " + dano);
            //System.out.println("oi"+dano);
        }
}
    public static void main(String[] args){
        System.out.println("Vitalidade antes de ser assustado: " + vitalidade);
        assustar();
        System.out.println("Vitalidade depois de ser assustado: " + vitalidade);
    }

}



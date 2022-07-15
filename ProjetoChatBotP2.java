import java.util.Scanner;


public class ProjetoChatBotP2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, me chamo Flint e serei o seu guia nessa jornada de escolhas que você deverá fazer :) ");
        System.out.println("Antes de começarmos gostaria de saber o seu nome caro aventureiro! ");
        String nome = input.next();
        System.out.println("Ah, prazer "+ nome + " espero que nos demos bem nessa jornada!");
    }
}

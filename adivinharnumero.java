import java.util.*;
public class adivinharnumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numsorteado,escolha;
        numsorteado = random.nextInt(20);
        int tentativa = 10;
        while (true){
            System.out.println("\n\33[36mTente adivinhar o número sorteado, sabendo que ele está entre 0 e 20: ");
            escolha = input.nextInt();
            if(escolha < numsorteado){
                System.out.println("\33[31mO valor digitado é menor que o número sorteado");
            }
            if (escolha > numsorteado){
                System.out.println("\33[34mO valor digitado é maior que o número sorteado");
            }
            tentativa = tentativa -1;
            if (escolha == numsorteado){
                System.out.println("\33[33mVocê acertou e ainda restavam " + tentativa+ " Tentativas, parabéns!!!");
                break;
            }
            if(tentativa == 0){
                System.out.println("\33[31mAcabaram as suas 10 tentativas, o número sorteado era: \n" + numsorteado);
                break;
            }


    }}}


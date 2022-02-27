import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Fatorial {
    public static void main(String[] args) {
        //Faça um código que calcule o fatorial de um número.
        Scanner input = new Scanner(System.in);
        int fatorial;
        int continuar = 1;
       while(continuar == 1){
            System.out.print("Digite o valor do número que deseja saber o fatorial: ");
            fatorial = input.nextInt();//esse comando é usado para o usuário digitar.
            int num = fatorial;
            int resultado = 0;
            for(int contador = 1;contador < fatorial;contador++){
                resultado = num * contador;
                num = resultado;}
            System.out.println("\33[36mO fatorial de " + fatorial + " é: "+ num );
           try {
               TimeUnit.SECONDS.sleep(5);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }//esse comando foi utilizado para atrasar o que está embaixo.
            System.out.println("\33[34mVocê deseja verificar um novo valor\n1=Sim\n2=Não");
            continuar = input.nextInt();}
       System.out.println("\33[33mObrigado por utilizar a nossa ferramenta.");
    }
}

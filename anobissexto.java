import java.util.Scanner;
public class anobissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ano;
        System.out.print("Qual ano você deseja saber se é bissexto? ");
        ano = input.nextInt();
        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("O ano de " + ano + " é bissexto." );}
        else{
            System.out.println("O ano de " + ano + " não é bissexto.");

        }


    }

}

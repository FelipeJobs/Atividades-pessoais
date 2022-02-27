import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Áreadeumtriângulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base,altura,area;
        int continuar = 1;
        while (continuar == 1){
            System.out.print("\33[36mInforma o valor da base: ");
            base = input.nextDouble();
            System.out.print("\33[34mInforma o valor da altura: ");
            altura = input.nextDouble();
            area = altura * base;
            System.out.println("\33[35mA área de um  retângulo de base: " + base +" e altura: "+altura + " é:\n" + area + " Metros quadrados.");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\n\33[32mVocê deseja realizar um novo cálculo" + "\n 1 = Sim\n 2 = Não" + "\nopção escolhida: ");
            continuar = input.nextInt();
        }}}

import java.text.DecimalFormat;
import java.util.*;
public class àreadeumcírculo {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        double raio;
        System.out.print("Qua o valor do raio da circunferência? ");
        raio = input.nextDouble();
        final double Pi = 3.14;
        double area = Math.pow(raio,2)*Pi;
        double comprimento = (2 * Pi) * raio;
        System.out.println("O valor da área da circunferência com raio " + raio + " é: "+ formatador.format(area));
        System.out.println("O valor da área do comprimento da circunferência com raio " + raio + " é: "+ formatador.format(comprimento));






    }
}

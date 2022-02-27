public class Horamanualmente {
    public static void main(String[] args) {
        long miliS = System.currentTimeMillis();
        long totalSegundos = miliS/1000;
        long segundoAtual = totalSegundos%60;
        long totalMinutos = totalSegundos/60;
        long minutoAtual = totalMinutos % 60;
        long totalHoras = totalMinutos/60;
        long horaAtual = (totalHoras%24) -3;
        System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual);
    }
}

public class OrdenandoNumeros {
    public static void main(String[] args) {
        double[] notasalunos = {7,5,8,9,10,20,30,40};
        double aux;
        for (int i = 0; i < notasalunos.length; i++) {
            for (int j = 0; j < notasalunos.length; j++) {
                if (j + 1 < notasalunos.length) {
                    if (notasalunos[j] > notasalunos[j + 1]) {
                        aux = notasalunos[j];
                        notasalunos[j] = notasalunos[j + 1];
                        notasalunos[j + 1] = aux;
                    }}}}
                    for(int c=0;c< notasalunos.length;c++){
                        System.out.print(notasalunos[c] + " ");
                    }

    }}

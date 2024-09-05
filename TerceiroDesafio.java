public class TerceiroDesafio {
    public static void main(String[] args) {

        int indice = 12, soma = 0, K = 1;

        while (K < indice) {
            K = K + 1;
            soma = soma + K;
        }

        System.out.println("Valor de SOMA: " + soma);
    }
}

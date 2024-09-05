import java.util.Scanner;

public class SegundoDesafio {

        // Função que conta quantas vezes a letra 'a' ou 'A' aparece em uma string
        public static int countLetterA(String str) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'a' || c == 'A') {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe uma string: ");
            String inputString = scanner.nextLine();

            // Conta o número de ocorrências da letra 'a' ou 'A'
            int occurrences = countLetterA(inputString);

            if (occurrences > 0) {
                System.out.println("A letra 'a' aparece " + occurrences + " vezes na string.");
            } else {
                System.out.println("A letra 'a' não foi encontrada na string.");
            }

            scanner.close();
        }


}

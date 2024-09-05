import java.util.Scanner;

public class PrimeiroDesafio {

    // Função que verifica se o número informado pertence à sequência de Fibonacci
    public static boolean isFibonacci(int nuemro) {
        if (nuemro == 0 || nuemro == 1) {
            return true;
        }

        int a = 0, b = 1;
        int fibonacci = a + b;

        while (fibonacci <= nuemro) {
            if (fibonacci == nuemro) {
                return true;
            }
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }
        return false;
    }

    // Função que gera a sequência de Fibonacci até um limite
    public static void printFibonacciSequence(int limit) {
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a + ", " + b);
        int fibonacci = a + b;

        while (fibonacci <= limit) {
            System.out.print(", " + fibonacci);
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar: ");
        int num = scanner.nextInt();

        // Gera e imprime a sequência de Fibonacci até o número informado
        printFibonacciSequence(num);

        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}

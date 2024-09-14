//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


        import java.util.Scanner;

        public class Fibonacci {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Informe um número: ");
                int numero = scanner.nextInt();

                if (Fibonacci(numero)) {
                    System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
                } else {
                    System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
                }
            }

            public static boolean Fibonacci(int n) {
                int a = 0, b = 1, c = 0;

                while (c < n) {
                    c = a + b;
                    a = b;
                    b = c;
                }

                return n == a || n == b;
            }
        }




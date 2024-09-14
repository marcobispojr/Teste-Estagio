
    import java.util.Scanner;

    public class Contagem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();

            int count = contarletraA(input);

            if (count > 0) {
                System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vezes.");
            } else {
                System.out.println("A letra 'a' não aparece na string.");
            }
        }

        public static int contarletraA(String str) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'A') {
                    count++;
                }
            }
            return count;
        }
    }



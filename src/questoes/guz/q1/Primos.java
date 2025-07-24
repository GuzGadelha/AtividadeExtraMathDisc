package questoes.guz.q1;

import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro positivo (≥ 2): ");
            if (!in.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                return;
            }

            int num = Math.abs(in.nextInt());
            if (num < 2) {
                System.out.println("Por favor, digite um número maior ou igual a 2.");
                return;
            }

            int totalPrimos = 0;

            for (int i = 2; i <= num; i++) {
                boolean primo = isPrimo(i);
                System.out.println("P(" + i + ") = " + primo);
                if (primo) {
                    totalPrimos++;
                }
            }

            System.out.println("Quantidade total de primos entre 2 e " + num + " = " + totalPrimos);
        }
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int raiz = (int) Math.sqrt(n);
        for (int i = 3; i <= raiz; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

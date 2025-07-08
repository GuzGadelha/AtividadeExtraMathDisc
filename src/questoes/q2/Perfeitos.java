package questoes.q2;

import java.util.Scanner;

public class Perfeitos {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro positivo: ");
            if (!in.hasNextInt()) {
                System.out.println("Entrada inválida. Digite apenas números inteiros.");
                return;
            }

            int limite = Math.abs(in.nextInt());
            int totalPerfeitos = verificarIntervalo(limite);

            System.out.println("De 2 a " + limite + ", existem " + totalPerfeitos + " números perfeitos.");
        }
    }

    public static boolean NumeroPerfeito(int n) {
        if (n < 2) return false;

        int soma = 1;
        int raiz = (int) Math.sqrt(n);

        for (int i = 2; i <= raiz; i++) {
            if (n % i == 0) {
                soma += i;
                int outroDivisor = n / i;
                if (i != outroDivisor) {
                    soma += outroDivisor;
                }
            }
        }

        return soma == n;
    }

    public static int verificarIntervalo(int limite) {
        int cont = 0;
        for (int i = 2; i <= limite; i++) {
            if (NumeroPerfeito(i)) {
                System.out.println(i + " é perfeito");
                cont++;
            } else {
                System.out.println(i + " não é perfeito");
            }
        }
        return cont;
    }
}

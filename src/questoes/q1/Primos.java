package questoes.q1;

import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            //  Receber com Scanner
            System.out.print("Digite um número inteiro positivo (≥ 2): ");
            //  Se for valido, vai entrar, caso não encerra o programa
            if (!in.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                return;
            }

            //  número absoluto
            int num = Math.abs(in.nextInt());
            //  Se for menor que 2 fecha o programa
            if (num < 2) {
                System.out.println("Por favor, digite um número maior ou igual a 2.");
                return;
            }

            int totalPrimos = 0;

            //  Testa se é primo de 2 ao limite
            for (int i = 2; i <= num; i++) {
                boolean primo = isPrimo(i);
                System.out.println("P(" + i + ") = " + primo);
                if (primo) {
                    totalPrimos++;
                }
            }
            //  Imprime total
            System.out.println("Quantidade total de primos entre 2 e " + num + " = " + totalPrimos);
        }
    }

    //  Função para saber se é primo
    public static boolean isPrimo(int n) {
        //  If para saber se é >= 2 retornando o false ou true para a main
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        //  Testa até a raiz
        int raiz = (int) Math.sqrt(n);
        for (int i = 3; i <= raiz; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

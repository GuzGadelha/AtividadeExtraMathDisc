package questoes.q2;

import java.util.Scanner;

public class Perfeitos {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite um número qualquer");
            int num = Math.abs(in.nextInt());

            int cont = 0;
            for (int i = 2; i <= num; i++) {
                int soma = 1; // 1 é sempre divisor
                
                // verificar até a raiz quadrada
                for (int x = 2; x <= Math.sqrt(i); x++) {
                    if (i % x == 0) {
                        soma += x;
                        if (x != i/x) { // evita contar duas vezes quando x é raiz quadrada
                            soma += i/x;
                        }
                    }
                }

                if (soma == i) {
                    cont++;
                    System.out.println(i + " é perfeito");
                } else {
                    System.out.println(i + " não é perfeito");
                }
            }
            System.out.println("De 2 a " + num + " temos " + cont + " números perfeitos.");
        }
    }
}
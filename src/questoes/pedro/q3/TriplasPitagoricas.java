package questoes.pedro.q3;

import java.util.Scanner;

public class TriplasPitagoricas {
    public static void encontrarTriplas(int n) {
        int contador = 0;
        System.out.println("\n--- Buscando triplas pitagóricas até N = " + n + " ---\n");

        // Itera sobre todos os valores possíveis para 'a'
        for (int a = 1; a <= n; a++) {
            // Itera sobre os valores de 'b', começando de 'a + 1' para garantir que a < b
            for (int b = a + 1; b <= n; b++) {
                // Calcula o valor de c²
                int cQuadrado = a * a + b * b;

                // Calcula o valor de c
                double c = Math.sqrt(cQuadrado);

                // Verifica se 'c' é um número inteiro e se não excede o limite N.
                // A condição (c % 1 == 0) verifica se 'c' não tem parte fracionária.
                if (c % 1 == 0 && c <= n) {
                    // A condição b < c é implicitamente satisfeita, pois c = sqrt(a² + b²) > sqrt(b²) = b
                    System.out.println("Tripla pitagórica encontrada: (" + a + ", " + b + ", " + (int)c + ")");
                    contador++;
                }
            }
        }

        // Imprime a quantidade total de triplas encontradas
        System.out.println("\nQuantidade total de triplas encontradas: " + contador);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N como limite superior: ");

        // Validação da entrada do usuário
        if (scanner.hasNextInt()) {
            int limite = scanner.nextInt();
            if (limite > 0) {
                encontrarTriplas(limite);
            } else {
                System.out.println("Erro: O número deve ser positivo.");
            }
        } else {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}

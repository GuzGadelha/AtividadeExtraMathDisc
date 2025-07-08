package questoes.q1;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);    //  Adicionando scanner para ler entrada do usuário
        System.out.println("Digite um número positivo acima de \"2\": ");   //  Perguntando e lendo entrada do usuário
        int num = in.nextInt();
        num = Math.abs(num);                 //  Caso o usuário digite um número negativo eu recebo o valor absoluto, ou seja, entendo como sendo positivo
        boolean primo = true;                //  Declarando bool para ser ou não primo,
        int cont = 0;                        //  contador inteiro para contar a quantidade de divisores,
        int totalPrimos = 0;                 // Contador dqa quantidade total de primos
        for (int i = 2; i <= num; i++){      //  Laço de repetição FOR para percorrer de 2 ao limite(num)
            for (int j = 1; j <= i; j++){    //  Laço para testar se o "i" é primo ou não
                if (i % j == 0){             //  Condicional para saber se é primo
                    cont++;
                }
            }
            if (cont > 2){                   // Se for divisivel por mais de 2, false. Caso contrario, true
                primo = false;
            } else{
                primo = true;
                totalPrimos++;
            }
            cont = 0;
            System.out.println("P(" + i + ") = " + primo);
        }
        System.out.println("Quantidade total de primos entre 2 e " + num + " = " + totalPrimos);

    }
}
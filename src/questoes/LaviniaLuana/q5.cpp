#include <iostream>
using namespace std;

int main() {
    int A, B;

    cout << "Digite dois numeros inteiros positivos A e B: ";
    cin >> A >> B;

    // DIVISORES 
    int totalA = 0, somaA = 0;
    cout << "\nDivisores de " << A << ": ";
    for (int i = 1; i <= A; i++) {
        if (A % i == 0) {
            cout << i << " ";
            totalA++;
            somaA += i;
        }
    }
    cout << "\nTotal de divisores de A: " << totalA << endl;
    cout << "Soma dos divisores de A: " << somaA << endl;

    int totalB = 0, somaB = 0;
    cout << "\nDivisores de " << B << ": ";
    for (int i = 1; i <= B; i++) {
        if (B % i == 0) {
            cout << i << " ";
            totalB++;
            somaB += i;
        }
    }
    cout << "\nTotal de divisores de B: " << totalB << endl;
    cout << "Soma dos divisores de B: " << somaB << endl;

    cout << "Soma total de quantidade de divisores: " << (totalA + totalB) << endl;

    // PRIMOS
    int num = A;
    cout << "\nFatores primos de " << A << ": ";
    for (int i = 2; i <= num; i++) {
        while (num % i == 0) {
            cout << i << " ";
            num = num / i;
        }
    }

    num = B;
    cout << "\nFatores primos de " << B << ": ";
    for (int i = 2; i <= num; i++) {
        while (num % i == 0) {
            cout << i << " ";
            num = num / i;
        }
    }
    cout << endl;

    //  MDC/MMC
    int a = A, b = B;
    while (b != 0) {
        int resto = a % b;
        a = b;
        b = resto;
    }
    int mdc = a;
    int mmc = (A * B) / mdc;

    cout << "\nMDC de " << A << " e " << B << ": " << mdc << endl;
    cout << "MMC de " << A << " e " << B << " (A x B / MDC): " << mmc << endl;

    return 0;
}

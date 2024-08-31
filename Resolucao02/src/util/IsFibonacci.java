package util;

public class IsFibonacci {

    public static boolean isFibonacci(int numero) {

        if (numero < 0) {
            return false; // Números negativos não pertencem à sequência de Fibonacci
        }

        int a = 0;
        int b = 1;

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        return false;
    }
}

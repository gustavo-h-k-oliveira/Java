/*
    Exemplo de cálculo realizado com JIT (Just-In-Time Compiler) para melhorar a performance.
*/

public class HighPerformance {

    public static void main(String[] args) {
        
        long soma = 0;

        for (int i = 0; i < 1000000; i++) {
            soma += i;
        }

        System.out.println("Resultado: " + soma);
    }
}

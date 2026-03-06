/*
    Exemplo de tratamento de exceções para lidar com erros.
*/

public class Robust {
    
    public static void main(String[] args) {

        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        }

        System.out.println("Programa continua executando.");
    }
}

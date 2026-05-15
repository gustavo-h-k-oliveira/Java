/* 
    Exemplo de uso de private para evitar comportamentos inseguros.
*/

class Conta {
    
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Secure {
    
    public static void main(String[] args) {
        System.out.println("Erro: saldo tem acesso privado em Conta.");
    }
}

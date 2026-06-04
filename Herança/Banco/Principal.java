package Herança.Banco;

public class Principal {
     public static void main(String[] args) {
        
        OperacaoBancaria deposito = new Deposito(1000);
        OperacaoBancaria saque = new Saque(720);

        deposito.executar();
        saque.executar();
     }
}

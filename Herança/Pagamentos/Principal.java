package Herança.Pagamentos;

public class Principal {
    
    public static void main(String[] args) {
        
        Pagamento cartaoCredito = new CartaoCredito(250, 3);
        Pagamento boleto = new Boleto(500, 1);
        Pagamento pix = new Pix(300);

        cartaoCredito.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();
    }
}

package Herança.Pagamentos;

public class Pix extends Pagamento {
    
    public Pix(double valor) {
        super(valor);
    }

    @Override
    void confirmarPagamento() {
        System.out.printf("Pagamento via Pix de R$%.2f confirmado.", valor);
    }
}

package Herança.Pagamentos;

public class CartaoCredito extends Pagamento {
    
    private int taxa;

    public CartaoCredito(double valor, int taxa) {
        
        super(valor);
        this.taxa = taxa;
    }

    double calcularTaxa(double valor, int taxa) {
        return valor * taxa / 100;
    }

    @Override
    void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f).\n", valor, calcularTaxa(valor, taxa));
    }
}

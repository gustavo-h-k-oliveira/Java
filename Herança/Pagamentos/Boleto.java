package Herança.Pagamentos;

public class Boleto extends Pagamento {
    
    private int taxa;

    public Boleto(double valor, int taxa) {
        
        super(valor);
        this.taxa = taxa;
    }

    double calcularTaxa(double valor, int taxa) {
        return valor * taxa / 100;
    }

    @Override
    void confirmarPagamento() {
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f).\n", valor, calcularTaxa(valor, taxa));
    }
}

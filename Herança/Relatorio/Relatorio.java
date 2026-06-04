package Herança.Relatorio;

public class Relatorio implements Imprimivel {
    
    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {

        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.printf("Título: %s\nConteúdo: %s", titulo, conteudo);
    }

    public static void main(String[] args) {
        
        Relatorio relatorio = new Relatorio("Relatório do Protótipo", "Conteúdo indisponível. Previsão de atualização: 12/06.");

        relatorio.imprimir();
    }
}

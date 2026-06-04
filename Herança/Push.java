package Herança;

public class Push extends Notificação {
    
    protected String titulo;

    public Push(String destinatario, String titulo, String mensagem) {

        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    void enviar() {
        System.out.printf("Enviando Push para: %s\nTitulo: %s\nConteúdo: %s\n", destinatario, titulo, mensagem);
    }

}

package Herança;

public class Notificação {

    protected String mensagem;
    protected String destinatario;

    public Notificação(String destinatario, String mensagem) {
        
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    void enviar() {}
    
}

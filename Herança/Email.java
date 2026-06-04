package Herança;

class Email extends Notificação {
    
    private String assunto;

    public Email(String destinatario, String assunto, String mensagem) {
        
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    void enviar() {
        System.out.printf("Enviando Email para: %s\nAssunto: %s\nCorpo: %s\n", destinatario, assunto, getMensagem());
    }
}

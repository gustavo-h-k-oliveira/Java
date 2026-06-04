package Herança.Notificação;

public class Sms extends Notificação {

    public Sms(String destinatario, String mensagem) {

        super(destinatario, mensagem);
    }

    @Override
    void enviar() {
        System.out.printf("Enviando SMS para: %s\nMensagem: %s\n", destinatario, mensagem);
    }
}

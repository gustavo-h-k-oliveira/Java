package Herança.Mensagens;

class Mensagem {

    void enviarMensagem(String mensagem) {
        System.out.printf("Mensagem enviada para todos: %s\n", mensagem);
    }

    void enviarMensagem(String mensagem, String destinatario) {
        System.out.printf("Mensagem para %s: %s\n", destinatario, mensagem);
    }

    void enviarMensagem(String mensagem, String destinatario, int quantidade) {
        
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Mensagem para %s: %s\n", destinatario, mensagem);
        }
    }

    public static void main(String[] args) {
        
        Mensagem mensagem = new Mensagem();

        mensagem.enviarMensagem("Olá a todos!");

        mensagem.enviarMensagem("Não coma no escritório!", "Maria");

        mensagem.enviarMensagem("Olá!", "João", 1);
    }
}

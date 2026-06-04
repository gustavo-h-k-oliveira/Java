package Herança.Notificação;

public class Principal {
    
    public static void main(String[] args) {
        
        Notificação email = new Email("gustavo@email.com", "Assunto urgente a ser tratado!", "O café do setor comercial acabou. Poderia comprar mais?");
        Notificação sms = new Sms("(11) 99887-7665", "Por favor, entre em contato assim que possível.");
        Notificação push = new Push("myApp","Você tem uma nova notificação", "Alguém curtiu ❤️ uma foto sua!");
        
        email.enviar();
        System.out.println();
        sms.enviar();
        System.out.println();
        push.enviar();
    }
}

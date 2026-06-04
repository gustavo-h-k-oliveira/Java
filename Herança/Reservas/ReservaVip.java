package Herança.Reservas;

public class ReservaVip extends Reserva {

    @Override
    void reservar() {
        System.err.println("Reserva VIP confirmada com atendimento exclusivo.");
    }
}
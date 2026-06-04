package Herança.Reservas;

public class Principal {
    
    public static void main(String[] args) {
        
        Reserva reserva = new Reserva();
        Reserva reservaVip = new ReservaVip();

        reserva.reservar();
        reserva.reservar("10/06");
        reserva.reservar("13/07", 4);

        reservaVip.reservar();
    }
}

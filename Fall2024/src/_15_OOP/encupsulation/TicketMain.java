package _15_OOP.encupsulation;

public class TicketMain {
    public static void main(String[] args) {


        Ticket VIPTicket = new Ticket("Jax", 829, "null","Bishkek Arena", true);
        System.out.println(VIPTicket);
        System.out.println(VIPTicket.HeadLiner);
        System.out.println(VIPTicket.getAddress());

        System.out.println(VIPTicket.showPlace());
        System.out.println(VIPTicket.changePlaceInFanZone());
    }
}

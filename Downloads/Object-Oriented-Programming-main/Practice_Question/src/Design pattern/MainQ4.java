class TicketDispenser {
    private static TicketDispenser dispenser = null;
    private int sNo = 0;
    public static TicketDispenser getInstance(){
        if (dispenser == null){
            dispenser = new TicketDispenser();
        }
        return dispenser;
    }
    private TicketDispenser(){
        System.out.println("Creating a ticket dispenser");
    }
    public Ticket dispenseTicket(String type){
        if (type == null){
            return null;
        }
        else if (type == "bumperCars"){
            this.sNo+=1;
            return new BumperCarsTicket(sNo);
        }
        else if (type == "rollerCoaster"){
            this.sNo+=1;
            return new RollerCoasterTicket(sNo);
        }
        else if (type == "ferrisWheel"){
            this.sNo+=1;
            return new FerrisWheelTicket(sNo);
        }
        else{
            return null;}}}
abstract class Ticket {
    private final int sNo;
    public Ticket(int sNo){
        this.sNo = sNo;
    }
    public int getsNo() {
        return sNo;
    }
}


class RollerCoasterTicket extends Ticket {
    public RollerCoasterTicket(int sNo){
        super(sNo);
    }


    @Override
    public String toString() {
        return String.format("S.No: %d for Rollercoaster ride", super.getsNo());
    }

}


public class MainQ4 {
    public static void main(String[] args) {
        TicketDispenser dispenser = TicketDispenser.getInstance();


        Ticket t1 = dispenser.dispenseTicket("bumperCars");
        Ticket t2 = dispenser.dispenseTicket("rollerCoaster");
        Ticket t3 = dispenser.dispenseTicket("ferrisWheel");

        System.out.format("Ticket 1: %s\n", t1.toString());
        System.out.format("Ticket 2: %s\n", t2);
        System.out.format("Ticket 3: %s\n", t3);
    }
}

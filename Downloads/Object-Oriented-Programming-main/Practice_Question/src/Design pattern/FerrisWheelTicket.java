public class FerrisWheelTicket extends Ticket {
    public FerrisWheelTicket(int sNo) {
        super(sNo);
    }


    @Override
    public String toString() {
        return String.format("S.No: %d for Ferris wheel ride", super.getsNo());
    }
}

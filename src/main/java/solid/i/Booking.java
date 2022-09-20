package solid.i;

public interface Booking {

    void bookTicket();

    void payBill();

    // Wrong Way, instead we can have payment as another interface
    void printTicket();
}

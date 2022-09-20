package solid.i;

// Separate Interface to manage the Payments and not to mix in Booking
public interface Payment {

    void connectToServer();

    void initializePayment();

    void copyInvoice();
}

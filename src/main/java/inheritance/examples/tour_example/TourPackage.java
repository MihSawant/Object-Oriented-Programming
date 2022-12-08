package inheritance.examples.tour_example;

public class TourPackage extends Travel {

    private int noOfPersons;
    private double totalPrice;

    public TourPackage(int noOfPersons, int code, String name, String[] destinations, double days, double price){
        super(code, name, destinations, days, price);
        this.noOfPersons = noOfPersons;
    }

    public void findTotal(){
        double perPerson = getTourPrice();
        totalPrice = noOfPersons * perPerson;
        System.out.println("Tour Price: "+totalPrice+" No.of Persons: "+noOfPersons);
        printTravelDetails();
    }


}

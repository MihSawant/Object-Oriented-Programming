package inheritance.examples.tour_example;

import java.util.Arrays;

public class Travel {
    private int tourCode;
    private String tourName;
    private String[] tourDestination;
    private double tourDays;

    private double tourPrice;

    public Travel(int tourCode, String tourName, String[] tourDestination, double tourDays, double tourPrice){
        this.tourCode = tourCode;
        this.tourDays = tourDays;
        this.tourDestination = tourDestination;
        this.tourName = tourName;
        this.tourPrice = tourPrice;
    }

    public void printTravelDetails(){
        System.out.println("Tour Code: "+tourCode+" Tour Name: "+tourName+" "+
                "Tour Destinations: "+ Arrays.toString(tourDestination)+" Tour Days: "+tourDays);
    }

    public double getTourPrice(){
        return this.tourPrice;
    }
}

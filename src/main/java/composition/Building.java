package composition;

import java.util.concurrent.atomic.AtomicLong;

public class Building {
    private String name;
    private Flat flat;

    private static int counter;

    public Building(String name){
        counter += 1;
        this.name = name;
        flat = new Flat(counter);
    }

    public int getFlatNo(){
        return flat.getNo();
    }

    public static void main(String[] args) {
        Building building = new Building("MH_COMPLEX");
        Building building2 = new Building("GJ_COMPLEX");

        System.out.println("Building: "+building.name+", Flat No: "+building.getFlatNo());
        System.out.println("Building: "+building2.name+", Flat No: "+building2.getFlatNo());

        // Destroying Building 1
        building = null;
        /* As the building get's destryoed, we cannot access the flat no also
           it will get destroyed in itself
           Flat is in building, without a building Flat will also not exist*/
        System.out.println(building.getFlatNo());
    }
}

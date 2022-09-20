package solid.l;

abstract class HotelStaff implements
    Cooking, Serving{
     String name;

    public HotelStaff(String name){
        this.name = name;
    }

    public void cookFood(){

    }

    public void serveFood(){

    }
}

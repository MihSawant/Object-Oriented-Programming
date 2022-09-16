package solid.l;

abstract class Staff {
    private String name;

    public Staff(String n){
        name = n;
    }

    abstract void cookFood();
    abstract void serveFood();
}

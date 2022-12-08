package misc.generics;

class Main {

    // A method that takes two generic params
    // Extending with nos as i only need difference between two values

    public static  <U extends Number, V extends Number> void difference(U first, V second){
        if(first instanceof Integer && second instanceof Integer){
            System.out.println(first.intValue() - second.intValue());

        }
        if(first instanceof Double && second instanceof Double){
            System.out.println(first.doubleValue() - second.doubleValue());
        }
    }

    public static void main(String[] args){
        Main.difference(15, 10);
        Main.difference(20.3, 23.3);
        // will not compile as strictly Number instances are required
//         Main.difference("1", "2");
    }
}

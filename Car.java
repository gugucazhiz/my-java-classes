public class Car extends Vehicle{

    void go(){
        System.out.println("The Car goes like Vrum Vrummm");
    }
    /*
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    public String toString(){
        return make+"\n"+model+"\n"+color+"\n"+year;
    }

    void drive(){
        System.out.println("You Drive the car");
    }
    void brake(){
        System.out.println("You step on the brakes. ");
    }
    */
    String name;

    Car(String name){
        this.name = name;
    }
}

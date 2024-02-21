public class f38 {
    public static void main(String[] args) {
        //abstract = abstract classes cannot be instantiated, but they can
        //have a subclass
        //abstract method are declared without an implemetation

        Car car = new Car("a");

        car.go();
    }
}

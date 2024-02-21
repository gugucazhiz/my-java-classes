public class f34 {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method
        //is created and shared 
        //              The class "owns" the static member

        Pillows pillow = new Pillows("Pena de Papagaio");

        System.out.println(Pillows.numberOfFriends);

        Pillows pillow2 = new Pillows("Pena de urubu");
        Pillows pillow3 = new Pillows("Pele de guaxinim canadense");


        System.out.println(Pillows.numberOfFriends);

        Pillows.Displaynames();
    }
}

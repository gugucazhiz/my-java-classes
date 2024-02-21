public class f37 {
    public static void main(String[] args) {
        // super = keyword refers to the superclass (parent) of an object
        // very simillar to the "this" keyword.
        Filho filho1 = new Filho("Batman",42,"%%%");
        Filho filho2 = new Filho("Orangutango",42,"HU HA HA");

        System.out.println(filho1.toString());
        System.out.println(filho2.toString());
    }
}

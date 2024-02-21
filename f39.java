public class f39 {
    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private
        // Can be Accessed only through methods(getters & setters)
        // you should make attibutes private if you dont have a reason
        // to make them

        Encapsulated encp = new Encapsulated("Marca A","Modelo A", 1);
        
        System.out.println(encp.getMake());
        encp.setMake("Marca B");
        System.out.println(encp.getMake());
    }
}

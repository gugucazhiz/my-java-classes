public class f28 {
    public static void main(String[] args) {
        Human human = new Human("Rick",65,70);
        Human human2 = new Human("Morgan", 23, 76);

        System.out.println(human.name);
        System.out.println(human2.name);

        System.out.println("");

        human2.eat("Hamburger");
        human.drink("Vodka");
    }

}

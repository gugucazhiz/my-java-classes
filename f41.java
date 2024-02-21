public class f41 {
    public static void main(String[] args) {
        // interface == template that can be applied to a class.
        //           simmilar to inheritance, but specifies what a class
        //           has/must do.
        //           classes can apply more than one interface, inheritance
        //           is limited to 1 super

        Cat cat = new Cat();
        cat.flee();

        Shark shark = new Shark();
        shark.Attack();

        Urso urso = new Urso();

        urso.Attack();
        urso.flee();
    }
}

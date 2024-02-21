import java.util.Scanner;

public class f30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Here: ");
        String a = scan.nextLine();

        Pizza pizza =new Pizza("Thicc crust","Tomato","Mozzerrela","A");
        System.out.println(pizza.all);
    }
}

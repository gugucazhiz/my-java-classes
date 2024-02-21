import java.util.Scanner;

public class f4 {
    public static void main(String[] args) {
       /*  Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are u? ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        // é interessante colocar esse scanner.nextline here
        //because toda vez que esse scan ele é usado é como se ele deixasse um "/n"
        //isso faz com que qualquer outro scan que voce queira dar bug e ele
        //simplismente não leia
        //

        System.out.println("Sua comida favorita? ");
        String food = scanner.nextLine();


        System.out.println("\nYour name is: "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Sua comida favorita é: "+food);
        */

        Scanner xerox = new Scanner(System.in);

        int abc = xerox.nextInt();
        System.out.println("o numero e: "+abc);
    }
}
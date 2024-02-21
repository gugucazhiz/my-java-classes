import java.util.Scanner;

public class f13 {
    public static void main(String[] args) {
    //while loop = executes a block of code as long as it codition remains true

    Scanner scanner = new Scanner(System.in);
    String name ="";

    while (name.isEmpty()){
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
    }
    System.out.println("\nHallo: "+name);

    //there is another way of doing it 
    //using (   do - while   ) method.

    name = "";
    do{
        System.out.println("Enter Your name: ");
        name = scanner.nextLine();
    }
    while(name.isEmpty());
    
    System.out.println("Your name is: "+name);
    }
}

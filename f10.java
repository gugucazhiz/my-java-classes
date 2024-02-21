import java.util.Scanner;

public class f10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say your age: ");
        int age = scanner.nextInt();


        if(age>=18 && age <= 74){ //if the age is between 18 and 74, if else pass through
            System.out.println("You are adult, you have: "+age+" years old");
        }
        else if(age >= 75){
            System.out.println("OKAY BOMMER!");
        }

        else{
            System.out.println("You are underage your age is: "+age);
        }

    }
}

import java.util.Scanner;

public class f16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //array = used to store mutiple values in a single variable

        String[] cars = {"carro fudido","civic","chevette",};// todos os valores -
        //desse array devem ser do tipo string

        cars[0] = "L200"; // eu fiz a alteração do primeiro elemento do meu array

        System.out.println(cars[0]);
        System.out.println();

        for(int i=0;i<=cars.length-1;i++){
           System.out.println(cars[i]);
        }


        String[] cars2 = new String[3];
        
        for(int j=0;j<=cars2.length-1;j++){
            System.out.println("Digit the '"+(j+1)+"' car of 3: ");
            cars2[j] = scanner.nextLine();
        }

        System.out.println();

        for(int k=0;k <cars2.length;k++){
            System.out.println(cars2[k]);
        }
    }
}

package BeeCrowd;
import java.util.*;

public class Therace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantity;

        System.out.println("Digite The Amount/Slugs:");
        quantity=scan.nextInt();

        TheraceBack slugs = new TheraceBack(quantity);

        slugs.verif();
    }
    
}

import java.util.Scanner;

public class f8indhypotenuse {
    public static void main(String[] args) {
        
        double x;
        double y;
        double z;

        Scanner escanear = new Scanner(System.in);

        System.out.println("Enter side X: ");
        x= escanear.nextDouble();

        System.out.println("Enter side y: ");
        y= escanear.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println(z);
        
        escanear.close();



    }
}

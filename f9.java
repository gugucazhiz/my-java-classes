import java.util.Random;
import java.util.Scanner;
public class f9 {
    public static void main(String[] args) {
        Random random = new Random();

        //Scanner escanear = new Scanner(System.in);
        //escanear.nextLine()            so pra ver se lembro ksksks

        int x =random.nextInt(6)+1; // x vai receber o proximo valor aleatorio
        //sera randomizado um valor entre 6 e 1

        double c = random.nextDouble(20)+1;

        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(c);
        System.out.println(z);

    }
}

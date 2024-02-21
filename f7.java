import java.util.Scanner;
public class f7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double x = scan.nextInt();
        System.out.println("Digite outro numero: ");
        double y = scan.nextInt();

        double z = Math.max(x, y);
        double v = Math.abs(y);  // its going to show the absolute value
        double b = Math.sqrt(x); //raiz quadrada
        double n = Math.round(x); //arredondar  math.ceil = arrendondar pra cima
                                  // math.floor = arrendondar pra baixo

        System.out.println("The bigger number is "+z);
        System.out.println("\nThe absolute value is :"+ v);
        System.out.println("raiz quadrada de 3,14: "+b);
        System.out.println("3,14 arredondado é igual a: "+n);
    }
}

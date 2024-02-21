import java.util.Scanner;

public class f24 {
    public static void main(String[] args) {
        // overloaded methods that share the same name but have different
        //parameters 
        // methods name + parametrs = method signature 
        double x = add(1.2, 3.2, 4.1, 5.0);
        System.out.println(x);

        Scanner escanear = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = escanear.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = escanear.nextInt();

        escanear.nextLine();

        System.out.println("Deseja continuar? S/N");
        String continue1 = escanear.nextLine();
        
        if(continue1.equalsIgnoreCase("s") || continue1.equalsIgnoreCase("sim")){
           System.out.println("Digite o terceiro valor: ");
           int valor3 = escanear.nextInt();
           escanear.nextLine();

           System.out.println("Deseja continuar? S/N");
           String continuar2 = escanear.nextLine();

           if(continuar2.equalsIgnoreCase("s") || continuar2.equalsIgnoreCase("sim")){
           System.out.println("Digite o quarto valor: "); 
           int valor4 = escanear.nextInt();

           add(valor1, valor2, valor3, valor4);
           }
           else{
           add(valor1,valor2,valor3);
           }
        }
        else{
        add(valor1, valor2);
        }
    }
    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }

        static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a+b+c;
    } // that is a overload method se o usuario der input de 2 parametros vai para o 
    //primeiro, ser for 3 para o segundo metodo

        static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a+b+c+d;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method double");
        return a+b+c+d;
        }
}

import java.util.Scanner;

public class metododevolta {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = escanear.nextInt();
        System.out.println("Digite outro numero: ");
        int b = escanear.nextInt();

        int c = soma(a,b); // c vai receber os valores que foram inseridos no metodo

        System.out.println("Sua soma é de: "+c);
    }
    static int soma(int numero1,int numero2){
        return numero1+numero2; //pode fazer assim ou assim:
        
        // int x = numero1+numero2;
        // return x;
    }
}

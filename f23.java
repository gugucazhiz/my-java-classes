import java.util.Scanner;

public class f23 {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

        //pode transferir valores para metodos tambem
        Scanner escanear = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String name = escanear.nextLine();

        segundometodo(name);

        //numeros tambem funcionam 
        System.out.println("Qual sua idade: ");
        int idade = escanear.nextInt();
        terceirometodo(idade);
    }
//os parametos desse metodo são esses, para ele funcionar precisa receber alguma string
    static void segundometodo(String title) {
        System.out.println("Hello "+ title);
    }

    static void terceirometodo(int age){
        System.out.println("Sua idade é: "+ age);
    }
}

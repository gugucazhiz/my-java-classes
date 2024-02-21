import java.util.Scanner;

public class f11 {
    public static void main(String[] args) {
        //switchs is used in cases where u have a lot of (if-else) statements

        Scanner escanear = new Scanner(System.in);
        System.out.println("Chose one: \n1)Sonntag\n2)Montag\n3)Dienstag\n4)Mittwoch");
        System.out.println("5)Donnerstag\n6)Freitag\n7)Samstag");
        System.out.println("\nDigit here one number from 1-7: ");
        int dow = escanear.nextInt();
        
        switch(dow){ //lembrar de adicionar o break in each case se não
                     // o codigo vai executar todos os breaks abaixo do escolhido
            case 1:
            System.out.println("Domingo-Sunday-Sonntag");
            break;

            case 2:
            System.out.println("Segunda-Monday-Montag");
            break;

            case 3:
            System.out.println("Terça-Tuesday-Dienstag");
            break;

            case 4:
            System.out.println("Quarta-Wednesday-Mittwoch");
            break;

            case 5:
            System.out.println("Quinta-Thursday-Donnerstag");
            break;

            case 6:
            System.out.println("Sexta-Friday-Freitag");
            break;

            case 7:
            System.out.println("Sabado-Saturday-Samstag");
            break;
        }

    }
}

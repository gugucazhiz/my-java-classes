import java.util.Scanner;

public class f12 {
    public static void main(String[] args) {
        // && = (and) both conditions must to be true
        // || = (or) either condition must be true
        // !  = (not) reverses boolean value of condition

        Scanner escanear = new Scanner(System.in);
        System.out.println("Digit a tempture in celcius from 0 to 100: ");
        double temp = escanear.nextDouble();
        
        //EXEMPLE OF &&

        if (temp >= 41){
            System.out.println("U must be on the sahara desert with: "+temp+" Degrees");
        }
        else if(temp >= 27 && temp <= 40){
            System.out.println("THATS HOT AS FUCK: "+temp+" Celcius degrees");
        }
        else{
            System.out.println("its cold outside: "+temp+" Celcius degrees");
        }

        //Exemple of ||

        System.out.println("\nVoce prefere: \n1)Pepsi \n2)Sprite \n3)It");
        int soda = escanear.nextInt();

        if (soda == 1 || soda == 2){
            System.out.println("You can't do it");
        }
        else{
            System.out.println("OTIMO GOSTO, Voce bebe It!! MHHHHHHH");
        }

        // EXAMPLE OF !

        System.out.println("\nVoce prefere: \n1)Pepsi \n2)Sprite \n3)It");
        int soda2 = escanear.nextInt();

        // se o INPUT NÃO FOR 1 OU 2 ele executa SE FOR ele pula
        if (!(soda2 ==1) && !(soda2 == 2) ){
            System.out.println("You can't do it");
        }
        else{
            System.out.println("OTIMO GOSTO, Voce bebe It!! MHHHHHHH");
        }



    }
}

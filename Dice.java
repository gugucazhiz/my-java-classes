import java.util.Random;

public class Dice {

    Random random = new Random();
    int number; 
    //foi declarado fora do methodo
    //mas dentro da classe, logo são globais


    Dice(){
        //random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}

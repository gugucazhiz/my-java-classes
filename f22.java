import java.lang.reflect.Array;
import java.util.ArrayList;

public class f22 {
    public static void main(String[] args) {
        // for - each 
        // less steps, more readable 


        String[] animals = {"cat","dog","zebra","lion"};
        ArrayList<String> animais = new ArrayList<>();

        animais.add("Papagaio");
        animais.add("coelho");
        animais.add("cachorro");
        animais.add("piriquito");

        for(String i : animals){
            System.out.println(i);
        }

        System.out.println("\n");

        for(String a : animais){
            System.out.println(a);
        }

    }
}

import java.util.ArrayList;

public class f20 {
    public static void main(String[] args) {
        //array list = a resizable array.
                       // elements can be added and removed after compilation
                       //store reference data types
                       
        String[][] OLA = new String[1][1]; //reinforçando o conteudo

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("coxinha");
        food.add("pastel");
        food.add("pastel");

        food.set(0,"empanado"); //vai subistituir a pizza
        food.remove(3); //apaga o 3 elemento do array no caso o 4
        //food.clear vai limpar todos os elementos do array

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}

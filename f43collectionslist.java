import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class f43collectionslist {
    public static void main(String[] args) {

        ArrayList<String> teste = new ArrayList<>();
        teste.add("null");
        teste.remove(0);

        for(String a : teste){
            System.out.println(a);
        }
        //ArrayList creates an array of objects 
        //where the array can grow dynamically.

        List<String> teste2 = new ArrayList<>();
        teste2.add("null");
        teste2.remove(0);

        //List interface creates a collection of 
        //elements that are stored in a sequence and they are 
        //identified and accessed using the index.


        //List is an interface implemented by ArrayList class. 
        //Another well-known implementation of the List is LinkedList.

        //ways of starting a list
        List notas = new ArrayList();
         // antes do java 5

        List<Integer> notas1 = new ArrayList<>();

        List<Double> notas2 = new ArrayList<>(Arrays.asList(4d,53d,2d,6d));
        //lista ja começa com um valor
        
        List<Double> notas3 = Arrays.asList(2d,4d,5d,7d);
        //dessa forma aqui não e possivel adicionar mais valores
        //ou remover esses valores dessa lista

        List<Double> notas4 = List.of(2d,4d,1d);
        //Dessa maneira tambem não é possivel remover nem adicioanr
        //valores (imutavel)



        ////////////// MANEIRAS DE ALTERAR VALORES
        System.out.println("Exiba a posição da nota 53d: "+ notas2.indexOf(53d) );
        
        System.out.println("Adicione o valor 6.0 na posição 3");
        notas2.add(2,6.0);
        for(Double i : notas2){
            System.out.println(i);
        }
        
        System.out.println("Subistitua a posição 2 pelo valor 4.9");
        notas2.set(1, 4.9);
        System.out.println(notas2);
        
        System.out.println("O valor 4.8 esta presente? "+notas.contains(4.8));
        
        System.out.println("Exiba os itens de acordo com a ordem de inserção");
        for(Double nota : notas2) System.out.println(nota);
    }
}
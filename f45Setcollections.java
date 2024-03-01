import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

public class f45Setcollections {
    public static void main(String[] args) {
        Set<Double> novo = new HashSet<>(Arrays.asList(2d,5d,6d,3d,1d,1d)); //elementos repetidos ele n tolera
        System.out.println(novo.toString());

        //Checando valor presente no set
        System.out.println(novo.contains(2d));

        System.out.println("Menor nota : "+ Collections.min(novo));
        System.out.println("Maior nota: "+Collections.max(novo));

        Iterator<Double> somaValores = novo.iterator();
        Double soma = 0d;
        while (somaValores.hasNext()){
            Double next = somaValores.next();
            soma += next;
            System.out.println(next);
        }
        System.out.println("Soma de todos valores é : "+soma);

        //Com o linked hash set ira mostrar os valores por ordem de inserção e não mais aleatorios.
        Set<Double> novo2 = new LinkedHashSet<>(Arrays.asList(5d,6d,2d,76d,4d,23d));
        novo2.add(4d);
        System.out.println("----------------------------");
        System.out.println("VALORES DO LINKED HASH SET");
        Iterator<Double> somavalores2 = novo2.iterator();
        while(somavalores2.hasNext()){
            
            System.out.println(somavalores2.next());
        }
        System.out.println("-----------------------------------------");
        //Utilizando o tree set para organizar os valores em ordem crescente
        Set<Double> novo3 = new TreeSet<>(novo2);  //So e possivel passar novo2 como argumento pois
                                                   //Dentro da classe double tem o metodo "Comparator"/"Comparable"
        System.out.println(novo3);
    }
}

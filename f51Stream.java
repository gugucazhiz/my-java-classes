import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import LeetCode.teste;

public class f51Stream {
    public static void main(String[] args) {
        List<String> teste123 =  Arrays.asList("2","7","5","6","1","3","0","10","12");

       // Garage garage = new Garage(){
       //     void park(Car car){
       //         System.out.println("asd");
       //     }
       // };             SOMENTE TESTANDO CLASSE ANONIMA


        // Lendo  todos os intens do array com classe anonima
        teste123.stream().forEach(new Consumer<String>() {
            public void accept(String a){
                System.out.println(a);
            }
        });

        // Lendo tambem todos os intens do array com lambda
        teste123.stream().forEach(s -> System.out.println(s));


        System.out.println("\n \n");

        teste123.stream().forEach(System.out::println); //modo de leitura stream
        //para cada valor sera dado system.out.println


        System.out.println("\n \n");
        //Listando 4 primeiros itens e colocando dentro de um <SET>

        Set<String> Teste2 = teste123.stream().limit(4).collect(Collectors.toSet());; //limitei ate o item 4 e
        //PASSEI OS VALORES PARA UM SET Depois disso armazei esses valores em um teste2
        Teste2.stream().forEach(new Consumer<String>() {
            public void accept(String L){
                System.out.println(L);
            } 
        });

        System.out.println("\n \n");

        //1)Transformando esses valores em inteiros !!!! USANDO ANONYMO
        teste123.stream().map(new Function<String,Integer>() {
            public Integer apply(String s){
                return Integer.parseInt(s);
            }
        });
        //2)Mesma coisa mas agora usando lambda
        teste123.stream().map(s -> Integer.parseInt(s));

        //3)Armazendo esses valores agora em uma list
        List<Integer> Teste3 = teste123.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(Teste3);


        System.out.println("\n \n");
        //usei o function dessa vez no .map()
        //Selecione somentes os numeros pares e maiores que 2
        teste123.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
        //puxei a a lista teste123 com o stream
        //transformando-a em String
        //logo apos puxo o .map()
        //transformando-a em Integer
        //filtro os valores maiores que 2 e positivos 
        //colleto esses valores e passo para o .tolist()
        //transformando-os em uma lista

        List<Integer> Teste4 = teste123.stream().map(Integer::parseInt).filter(i->i%2==0 && i>=2).toList();
        System.out.println(Teste4);


        System.out.println("\n \n");

        //Media dos valores
        //OBS tem que usar o .mapToInt() e não o .map() normal
        teste123.stream().mapToInt(i ->Integer.parseInt(i)).average().ifPresent(System.out::println);

        //Removendo numeros impares
        List<Integer> Test5 = teste123.stream().map(i-> Integer.parseInt(i)).collect(Collectors.toList());
        Test5.removeIf(i-> i%2 >= 1); //remova se o resto da divisão for maior ou igual a 1
        System.out.println(Test5);


        //BUscando o menor valor Usando lambda
        Integer menor = Test5.stream().min((Integer i1,Integer i2)-> Integer.compare(i1,i2)).get();

        System.out.println(menor);
    }
}

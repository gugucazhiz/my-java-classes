package BeeCrowd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class arcoiris {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        Set<String> lista = new LinkedHashSet(){{
            add("Vermelho");
            add("Verde");
            add("Amarelo");
            add("Azul");
            add("Anil");
            add("Laranja");
            add("Violeta");
        }};
        
        //TODOS OS VALORES NA ORDEM INFORMADA:
        System.out.println(lista);

        //UM ABAIXO DA OUTRA    
        for(String a : lista){
            System.out.println("\n"+a);
        }

        //NA ORDEM REVERSA
        List<String> lista2 = new ArrayList<>(lista);
        Collections.reverse(lista2);
        System.out.println("\n"+lista2);

        //QUANTIDADE DE CORES
        System.out.println(lista.size());

        //Ordem Alfabetica
        Set<String> ordemAlfa = new TreeSet<>(lista);
        System.out.println(ordemAlfa);


        //SOMENENTE QUE COMEÇA COM V
        Iterator iterator1 = lista.iterator();
        while(iterator1.hasNext()){
            String Cor = (String) iterator1.next();
            if(Cor.startsWith("V") || Cor.startsWith("v")){
                System.out.println(Cor);
            }
        }
        //REMOVE SE FOR COMEÇADO COM V
        Iterator iterator2 = lista.iterator();
        while (iterator2.hasNext()) {
            String Cor2 = (String) iterator2.next();
            if(Cor2.startsWith("V")){
                iterator2.remove();
            }
        }
        System.out.println("\n"+lista);
        
        //ESVAZIANDO E CHECANDO
        lista.clear();
        System.out.println(lista.isEmpty());
        System.out.println("\n"+lista);
    }
}

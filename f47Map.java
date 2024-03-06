import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import LeetCode.teste;



public class f47Map {
    public static void main(String[] args) {
        //Criando map 


        Map<String, Double> Carros = new HashMap<>(){{
            //não se usa o add se usa o put aqui no hashmap
            put("Gol", 14.5);
            put("Uno", 15.6);
            put("Mobi",16.1);
            put("Hb20",14.5);
            put("Kwid",15.6);
            put("Hilux",9.8);
            put("Civic",14.5);
        }};
        System.out.println(Carros);

        //MUDANDO O CONSUMO DO GOL PARA 13.0

        Carros.put("Gol", 13.0);

        //Confira se a chave tucson existe

        System.out.println(Carros.containsKey("Tucson"));

        //CONFERINDO SE O VALOR 15.6 EXISTE
        System.out.println(Carros.containsValue(15.6));

        //Exiba o consumo do hb20

        System.out.println(Carros.get("Hb20"));

        //EXIBA OS MODELOS
        Set<String> modelos = Carros.keySet();
        System.out.println(modelos);
        //EXIBA O CONSUMOS
        Collection<Double> consumo = Carros.values();
        System.out.println(consumo);

        //EXIBA O MAIS ECONOMICO
        Double consumo2 = Collections.max(Carros.values());
        Set<Map.Entry<String,Double>> Entries = Carros.entrySet();
        
        String ModelomaisEficiente = "";

        for(Map.Entry<String, Double> entry: Entries){
            if(entry.getValue().equals(consumo2)){ 
            ModelomaisEficiente = entry.getKey();
            }
        }

        System.out.println("Modelo mais eficiente: "+ModelomaisEficiente);
        System.out.println(consumo2);

        System.out.println("\n");

        for(String key : Carros.keySet()){
            System.out.println(key + " " + Carros.get(key) );
        }


        //CARRO QUE CONSOME MAIS
        Double bebemais = Collections.min(Carros.values());
        Set<Map.Entry<String,Double>> TodosOsCarros =Carros.entrySet();
        String CarWhoDrinksTheMost = "";

        for(Map.Entry<String,Double> key2: TodosOsCarros){
            if(key2.getValue().equals(bebemais)){
                CarWhoDrinksTheMost = key2.getKey();
            }
        }
        System.out.println("\n"+CarWhoDrinksTheMost +" Consumo de: "+bebemais);

        //Soma dos consumos
        Iterator<Double> Teste = Carros.values().iterator();
        Double soma = 0d;

        while(Teste.hasNext()){
            soma += Teste.next();
            System.out.println("\n"+ soma);
        }

        //Remova valores iguais "14,5"

        Iterator<Double> iterator2 = Carros.values().iterator();

        while(iterator2.hasNext()){
            if (iterator2.next().equals(14.5)){
                iterator2.remove();
            }
        }
        System.out.println("\n Carros: "+ Carros);

        // Map<String,Double> Carros2 = new TreeMap<>(Carros); PODERIA ESCREVER ASSIM, MAS IREI FAZER A MÃO

        Map<String,Double> Carros2 = new TreeMap<>(){{
            put("Acura", 7.8);
            put("Gol", 14.5);
            put("Uno", 15.6);
            put("Mobi",16.1);
            put("Hb20",14.5);
            put("Kwid",15.6);
            put("Hilux",9.8);
            put("Civic",14.5);
        }};

        System.out.println("\n VALORES ORGANIZADOS DE MANEIRA NATURAL: \n"+ Carros2);

        //APAGUE O CONJUTO DE CARROS
        Carros2.clear();
        System.out.println("\n"+Carros2);

        System.out.println("ESTA VAZIO? "+Carros2.isEmpty());
    }
}

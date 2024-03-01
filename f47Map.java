import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        Double Bebemais =Collections.min(Carros.values());
        Set<Map.Entry<String,Double>>carrosbebos = Carros.entrySet();
        String CarrosQueConsomeMais = "";
        Double valordoconsumo = 0d;
        
        //Criado a variavel de comparação key 2  // recebendo valores de carrosbebos
        for(Map.Entry<String,Double> key2 : carrosbebos){
            //SE a variavel que recebe valores do map for igual ao menor valor do map
            if(key2.getValue().equals(Bebemais)){
                //Então a String recebe o key Correspondente a este carro;
                CarrosQueConsomeMais = key2.getKey();
                valordoconsumo = key2.getValue();
                //EU SEI QUE PODERIA TER USADO A VARIAVEL "BEBEMAIS" DIRETAMENTE;
                //mas estava testando
            }
        }
        System.out.println("O carro que mais consome é o :"+CarrosQueConsomeMais);
        System.out.println("Valor do consumo: "+valordoconsumo+" "+Bebemais);
    }
}

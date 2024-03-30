import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.TreeSet;

public class f50Stream{
    public static void main(String[] args) {
    Map<String,Barcos> barcos = new HashMap<>(){{
        put("BR", new Barcos("Caravela green", 1500000));
        put("USA",new Barcos("Titan from the oceans", 10000000));
        put("United Kigdom",new Barcos("FILTER", 2500000));
        put("Mexico",new Barcos("Atlantics", 1900000));
        put("Australia",new Barcos("Tom jorg", 2000000));
    }};

    Set<Map.Entry<String,Barcos>> barcoEntries = new TreeSet<>(new Comparator<Map.Entry<String,Barcos>>() {
        @Override
        public int compare(Entry<String, Barcos> o1, Entry<String, Barcos> o2) {
            return o1.getValue().getBarco().compareToIgnoreCase(o2.getValue().getBarco());
        }
        
    }); //usando os principios de classe anonima, classe instaciada e usada somente uma vez
    barcoEntries.addAll(barcos.entrySet());

    System.out.println(barcoEntries);


    //Usando function para fazer o sort /// USEI UM REVERSE ORDEM PRA VIR NA ORDEM INVERSA
    Set<Map.Entry<String,Barcos>> barcoSet = new TreeSet<>(Collections.reverseOrder(Comparator.comparing(new Function<Map.Entry<String,Barcos>,Integer>(){
        @Override
        public Integer apply(Entry<String, Barcos> t) {
            return t.getValue().getPreco();
        }
        
    })));

    barcoSet.addAll(barcos.entrySet());
    System.out.println(barcoSet);
    
    System.out.println("DIVISORIA ---------------------------------- LAMBDA \n");

    
    //Usando lambda agora   //mais simplificado que fuction e classe anonyma
    //no java voce precisa especificar o "tipo" sempre que declarar algo novo
    //no caso não precisou especificar o "tipo" exemplo: (Barcos nomequalquer)
    //pois o tipo ja é especificado no começo: Set<Map.Entry<String,Barcos>>
    Set<Map.Entry<String,Barcos>> barcoSet2 = new TreeSet<>(Comparator.comparing(nomequalquer -> nomequalquer.getValue().getPreco()));
    barcoSet2.addAll(barcos.entrySet());
    System.out.println(barcoSet2);
    
    //USANDO FUNCTION NOVAMENTE
    Set<Map.Entry<String,Barcos>> barcoSet3 =new TreeSet<>(Comparator.comparing(new Function<Map.Entry<String,Barcos>,String>() {
        @Override
        public String apply(Entry<String, Barcos> t) {
            return t.getKey();
        }
    }));
    barcoSet3.addAll(barcos.entrySet());
    System.out.println("\n\n ----------------------FUNCTION AGAIN");
    System.out.println(barcoSet3);

    }
}


class Barcos{
    private String barco;
    private Integer preco;
    Barcos(String barcos,Integer preco){
        this.barco = barcos;
        this.preco = preco;
    }
    public String getBarco(){
        return barco;
    }
    public Integer getPreco(){
        return preco;
    }

    public String toString(){
        return "\nBarco: "+barco+"\nPreço: "+preco+"\n\n";
    }
}
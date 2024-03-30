import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class f49SetCollection{
public static void main(String[] args) {
    //A classe Anônima em java é uma classe que não recebeu nome 
    //e é tanto declarado e instanciado em uma unica instrução
    
    //é bom de usar quando for instaciar uma classe somente uma vez

    //Paises paizzz = new Paises(null, null){
    //    public String getPais(){
    //        System.out.println();
    //        return "novo metodo temporario";
    //    }
    //};
    System.out.println("\nExemplo acima de classe anonima");
    System.out.println("Neste caso eu queria mudar somente o metodo getPais,");
    System.out.println("Se fosse feito do jeito padrão eu teria que criar uma nova classe filha\ne impletar a classe país,");
    System.out.println("Apois isso fazer uso do metodo de polimofirsmo.");
    System.out.println("E nesse caso não, basta eu declarar o que serar mudado e sera feito somente uma vez\n");

    List<Paises> pais = new ArrayList<>(){{
        add(new Paises("Brasek", 892));
        add(new Paises("USado", 1203));
        add(new Paises("Xing Xing", 1802));
    }};

    pais.sort(new Comparator<Paises>() {
        @Override
        public int compare(Paises o1, Paises o2) {
            return o2.getPopulacao().compareTo(o1.getPopulacao());
        }
    }); 
    //como se tivesse fazendo aquela classe do comparator
    //aqui dentro do proprio sort
    System.out.println(pais);



    //Lambda é uma classe anonima simplificada
    pais.sort(Comparator.comparing((Paises paizis) -> paizis.getPopulacao()));
    System.out.println(pais);

    //Simplificando com reference method
    pais.sort(Comparator.comparing(Paises::getPopulacao));
    System.out.println(pais);

   }
}


class Paises{
    private String pais;
    private Integer populacao;

   Paises(String Paises, Integer populacao){
    this.pais = pais;
    this.populacao = populacao;
   }

   public String getPais(){
    return pais;
   }
   public Integer getPopulacao(){
    return populacao;
   }

   public String toString(){
    return "Pais: "+pais+" População: "+populacao;
   }
}
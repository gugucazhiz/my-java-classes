package BeeCrowd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.text.Format;
import java.text.NumberFormat;

public class Estados {
    public static void main(String[] args) {
        Map<String,classEstados> Nordeste = new LinkedHashMap<>(){{
            put("PE",new classEstados(9800000, 0.673));
            put("Rn",new classEstados(3409000, 0.684));
            put("Al",new classEstados(3300000, 0.677));
            put("Ce",new classEstados(8843000, 0.743));
            put("Ro",new classEstados(1400000, 0.756));
            put("Pi",new classEstados(3195000, 0.690));
        }};


        Nordeste.get("Rn").setPopulacao(3534265); //MUDANDO POPULAÇÃO DO RN
        System.out.println(Nordeste);

        //Conferindo se o PB esta no dicionario caso não adicione-o

        boolean contemestado =Nordeste.containsKey("Pb");
        if(contemestado == false) Nordeste.put("Pb",new classEstados(9058931, 0.673) );
        System.out.println(Nordeste);

        //População de Pe
        System.out.println("\nPopulçao de Pernambuco: "+Nordeste.get("PE").getPopulacao());

        //Ordem alfabetica dos estados
        Map<String,classEstados> Nordeste2 = new TreeMap<>(Nordeste);
        System.out.println(Nordeste2);

        //BUSCANDO ESTADO DE MENOR POPULAÇÃO
        Collection<classEstados> nordesteorg= Nordeste.values();
        ArrayList<classEstados> nordeste12 = new ArrayList<>(nordesteorg);

        nordeste12.sort(new comparadorpop());
        Set<Map.Entry<String,classEstados>> setNordeste = Nordeste.entrySet();

        for(Map.Entry<String,classEstados> i : setNordeste){
            if(nordeste12.getLast() == i.getValue()){
                System.out.println("Valor mais baixo"+i);
            }
        }
        //BUSCANDO ESTADO DE MAIOR POPULAÇÃO
        for(Map.Entry<String,classEstados> i : setNordeste){
            if(nordeste12.getFirst() == i.getValue()){
                System.out.println("Valor mais alto: "+i);
            }
        }

        //MEDIA DA POPULAÇÃO
        Integer media = 0;
        int div = 0;
        for(classEstados i : nordeste12){
            media +=i.getNumericpopula();
            div++;
            System.out.println(media);
        }
        NumberFormat inteiro2 = NumberFormat.getInstance();
        String divisao = inteiro2.format(media/div);
        System.out.println("\n MEDIA DA POPULAÇÃO É DE:"+divisao );

        //REMOVENDO ABAIXO DE 4.000.000 DE PESSOAS
        Set<Map.Entry<String,classEstados>> check4 = new HashSet<>(Nordeste.entrySet());
        for(Map.Entry<String,classEstados> i : check4){
            if(i.getValue().getNumericpopula() <= 4000000){
                Nordeste.values().remove(i.getValue());
            }
        }
        System.out.println("\n \n \n VALORES MENORES QUE 4M"+Nordeste);

        ///APAGANDO DICIONARIO
        Nordeste.clear();
        System.out.println("ESTA VAZIO? "+Nordeste.isEmpty());
    }
}




class classEstados {
    private String popula;
    private Integer populanumeric;
    private Double idh;
    classEstados(Integer popula,Double idh){
        this.populanumeric = popula;
        setPopulacao(popula);
        setIdh(idh);;
    }

    public Integer getNumericpopula(){
        return populanumeric;
    }

    public String getPopulacao(){
        return popula;
    }

    public Double getIdh(){
        return idh;
    }

    public void setPopulacao(Integer popula){
        this.popula = formatadora(popula);
    }
    public void setIdh(Double idh){
        this.idh = idh;
    }
    public String formatadora(Integer formatado){
        NumberFormat inteiro = NumberFormat.getInstance();
        String result = inteiro.format(formatado);
        return result;
    }
    public String toString(){
        return "\nPopulação: "+popula+"\nIDH: "+idh+"\n\n";
    }

}

class comparadorpop implements Comparator<classEstados>{

    @Override
    public int compare(classEstados o1, classEstados o2) {
       return o2.getNumericpopula().compareTo(o1.getNumericpopula());
    }}
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.lang.Comparable;

public class f46Setcollections {
    public static void main(String[] args) {
        Set<Series> listaSeries = new HashSet<>(){{
            add(new Series("Docktor Who","Investigação",40,5d));
            add(new Series("Breaking Bad","Drama/Investigation",50,4d));
            add(new Series("Lock and Key", "Sobrenatural", 50,4.3));
            add(new Series("The 100", "Ação", 60,5d));
        }};

        System.out.println("Inserção Aleatoria -------------------");
        System.out.println(listaSeries);


        System.out.println("\nOrdem de Inserção-------------------");
        Set<Series> listaSeries2 = new LinkedHashSet<>(){{
            add(new Series("Docktor Who","Investigação",40,5d));
            add(new Series("Breaking Bad","Drama/Investigation",50,4d));
            add(new Series("Lock and Key", "Sobrenatural", 50,4.3));
            add(new Series("The 100", "Ação", 60,5d));
            add(new Series("The Broklyn", "Humor", 60,3d));
            add(new Series("The Purge", "Gore", 80,4.4d));
        }};

        System.out.println(listaSeries2);

        //ORDENANDO PELA NOTA DEPOIS TEMPO E DEPOIS GENERO
        System.out.println("\n ORDEM NATURAL----------------------");
        System.out.println("-----------------------------------------NOTA---------------------------------");
        Set<Series> listaSeries3 = new TreeSet<>(listaSeries2);
        System.out.println(listaSeries3);


        //Utilizando uma classe construtor
        System.out.println("CONSTRUTOR -------------------------------------");
        Set<Series> listaSeries4 = new TreeSet<>(new organizaPorGenero());
        listaSeries4.addAll(listaSeries3);
        System.out.println(listaSeries4);
    }
}



class Series implements Comparable<Series>{
    private String nome;
    private String Genero;
    private Integer tempoMedio;
    private Double nota;
public Series(String nome, String Genero, Integer tempoMedio,Double nota){
this.nome = nome;
this.Genero = Genero;
this.tempoMedio = tempoMedio;
this.nota = nota;
}

public String getNome(){
    return this.nome;
}
public String getGenero(){
    return this.Genero;
}
public Integer getTempoMedio(){
    return tempoMedio;
}
public Double getNota(){
    return nota;
}
public String toString(){
    return "\n [Nome: "+this.nome+"\n Genero: "+this.Genero+"\n TempoMedio: "+this.tempoMedio+"\n Nota: "+nota+"]\n";
}

@Override
public int compareTo(Series o) {
    int notar = o.nota.compareTo(this.nota);
    if(notar != 0) return notar;
    int tempor = o.tempoMedio.compareTo(this.tempoMedio);
    if(tempor != 0) return tempor;
    else{
        return o.Genero.compareTo(this.Genero);
    }
}
}

class organizaPorGenero implements Comparator<Series>{

    @Override
    public int compare(Series o1, Series o2) {
        return o1.getGenero().compareToIgnoreCase(o2.getGenero());
        
    }
    
}
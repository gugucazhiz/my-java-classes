import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

public class f48MapCollections {
    public static void main(String[] args) {
        Map<String,Livro> DicAuthors = new HashMap<>(){{
            //put("Kurose ,Jim ", "Redes e computadores de internet");
            //put("Halking,Stephen","Buraco Negros");
            //put("Ana Fernanda Gomes","Estrutura De Dados");
            put("Kurose, Jim",new Livro("Redes e computadores de internet", 658));
            put("Halking,Stephen",new Livro("Buraco Negros", 64));
            put("Ana Fernanda Gomes",new Livro("Estrutura De Dados",434));
        }};

        System.out.println("ORDEM ALEATORIA: \n"+DicAuthors);
        System.out.println(DicAuthors.values());
        //ORDEM DE INSERÇÃO
        Map<String,Livro> DicAuthors2 = new LinkedHashMap<>(){{
            put("Kurose, Jim",new Livro("Redes e computadores de internet", 658));
            put("Halking,Stephen",new Livro("Buraco Negros", 64));
            put("Ana Fernanda Gomes",new Livro("Estrutura De Dados",434));
        }};
        System.out.println("ORDEM DE INSERÇÃO: \n"+ DicAuthors2);

        //treemap set
        Set<Map.Entry<String,Livro>> DicAuthors3 = new TreeSet<>(new Comparatoria());
        DicAuthors3.addAll(DicAuthors2.entrySet());
        System.out.println("\n LIVROS ORGANIZADOS: "+ DicAuthors3);

        Map<String,Livro> DicAuthors4 = new TreeMap<>(DicAuthors2);

        System.out.println("\n ORGANIZADO POR AUTORES \n:"+DicAuthors4);
      }
}


class Livro{
    private String Livroo;
    private Integer Paginas;

    Livro(String Livroo,Integer Paginas){
        //this.Autor = Autor;
        this.Livroo = Livroo;
        this.Paginas = Paginas;
    }

//   public String getAutor(){
//        return Autor;
//    }
    public String getLivro(){
        return Livroo;
    }
    public Integer getPaginas(){
        return Paginas;
    }
    
    public String toString(){
        return "\n [Livro: "+Livroo+"\n Paginas: "+Paginas+"]\n \n";
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o== null || getClass() != o.getClass()) return false;
        Livro livro = (Livro)o;
        return Livroo.equals(livro.Livroo) && Paginas.equals(livro.Paginas);
    }

    public int hashCode(){
        return Objects.hash(Livroo,Paginas);
    }
}

class Comparatoria implements Comparator<Map.Entry<String,Livro>>{


    @Override
    public int compare(Map.Entry<String, Livro> o1,Map.Entry<String, Livro> o2) {
        return o1.getValue().getLivro().compareToIgnoreCase(o2.getValue().getLivro());
    }

}
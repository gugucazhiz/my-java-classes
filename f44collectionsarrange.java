import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


     //
    //}
    
//}

public class f44collectionsarrange {
    public static void main(String[] args) {
        List<Gato> gatinho = new ArrayList<>(){{
            add(new Gato("Joseph", 12,"Branco"));
            add(new Gato("Joseph", 51, "Branco"));
            add(new Gato("Joseph", 23, "Branco"));
            add(new Gato("Joseph", 42, "Branco"));
        }};
        System.out.println(gatinho); //vai mostrar os objetos salvo na lista gatinho
        System.out.println(gatinho.get(0));//pegar o objeto salvo no
        //idex 0 dessa lista

        System.out.println(gatinho.get(0).getCor());
        //vai pegar o objeto 0 e apos dar o .getColor nesse objeto


        System.out.println("Embaralhando os valores: ");
        Collections.shuffle(gatinho);
        System.out.println(gatinho);

        System.out.println("Organizando pela ordem natural: ");
        Collections.sort(gatinho); //esse metodo sort
        //é precisa que seja criado um metodo comparetor dentro da classe
        //para que seja explicito o que sera comparado, no caso o nome.
        System.out.println(gatinho);

        //UTILIZANDO OUTRO CONSTRUTOR
        Collections.sort(gatinho,new comparador());
        System.out.println("------------------------ Contrutor Comparator");
        System.out.println(gatinho);
    }
}

class Gato implements Comparable<Gato>{
private String nome;
private int idade;
private String cor;

    public Gato(String nome,int idade,String color){
    this.nome = nome;
    this.idade = idade;
    this.cor = color;
}

    public String getNome(){
    return nome;
}

    public int getIdade(){
    return idade;
}
    public String getCor(){
    return cor;
}

    public String toString(){
        return "Nome==== "+nome+"  Idade==== "+
        idade+" Cor==== "+ cor+"\n";
}
//OBSERVAÇÃO IMPORTANTE Ja que foi utilizado o comparable para fazer novas comparaçoes teria que ser utilizado
//o comparator
@Override
public int compareTo(Gato o) {
    // TODO Auto-generated method stub

    // ORDENANDO POR A - Z Strings
    //return this.getNome().compareToIgnoreCase(o.getNome());
    //se der 0 os nomes são iguais

    //Ordenando por Idade = Integer
    //a variavel de idade é declarada como int mas passarei para seu invelcro pulando a necessidade de "if's"
    return Integer.valueOf(this.idade).compareTo(o.getIdade());
    
    //ELE so compara valores involucros 
    //valores primitivos voce teria que fazer a comparação de "if"
    //manualmente de ... 

    // SE FOSSE PRIMITIVO EXEMPLO :

    //(if this.getNome < o.getNome()) returt -1; 
    //(if this.getNome == o.getNome()) returt 0; 
    //(if this.getNome > o.getNome()) returt +1; 
}


}
class comparador implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        int name = o1.getNome().compareTo(o2.getNome()); // Se o nomer resultar como -1 ou +1 então o if roda pois
        if(name != 0 ) return name;
        //são  valores diferentes e  retorna a variavel name se der zero os valores são iguais.
        
        int cor =o1.getCor().compareTo(o2.getCor());// Se a cor resultar como -1 ou +1 então o if roda pois
        if(cor != 0) return cor;
        //são  valores diferentes e retorna a variavel cor se der zero os valores são iguais e pula pro proximo.
        
        //else{
            return Integer.compare(o1.getIdade(), o2.getIdade()); 
            //return Integer.valueOf(o1.getIdade()).compareTo(Integer.valueOf(o2.getIdade()));
        //}
    }
    
}


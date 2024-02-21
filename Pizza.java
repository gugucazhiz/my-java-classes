public class Pizza {
    String bread;
    String sauce;
    String chesse;
    String topping;
    String all;

    Pizza(){
        //argumento n possui nenhum input ou seja, caso
        //o user n adicione nada, na area de input logo ira retorna
        //esse object. 
    }

    Pizza(String bread,String sauce,String chesse,String topping){
        this.all = bread+","+sauce+","+chesse+","+topping+".";
        //this sabores, no caso esse sabores seria a string global
        //que eu consigo ter acesso pelo lado de fora da classe

    }
    Pizza(String bread,String sauce,String chesse){
        this.all = bread+","+sauce+","+chesse;
        //overloaded constructor exemple, se enviar somente 3 inputs
        //para a classe vai cair nesse metodo aqui.
    }
}

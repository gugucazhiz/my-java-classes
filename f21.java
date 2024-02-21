import java.util.ArrayList;

public class f21{
    public static void main(String[] args) {
        //2d lists 

        ArrayList<ArrayList<String>> Shop = new ArrayList<>();

        ArrayList<String> bakerylist = new ArrayList<>();
        
        bakerylist.add("Pasta");
        bakerylist.add("Pastel");
        bakerylist.add("Pão");

        ArrayList<String> Butchershop = new ArrayList<>();
        
        Butchershop.add("Coxão-mole");
        Butchershop.add("Contra file");
        Butchershop.add("Alcatra");
        Butchershop.add("Bisteca");

        ArrayList<String> Drinks = new ArrayList<>();
        
        Drinks.add("Matuta");
        Drinks.add("Pitu");
        Drinks.add("Caipirinha");

        //é aqui que voce vai colocar todas as listas em uma só
        Shop.add(Drinks);
        Shop.add(Butchershop);
        Shop.add(bakerylist);

        System.out.println(Shop.get(0)); // VAI PEGAR A PRIMEIRA LISTA
        System.out.println(Shop.get(0).get(0)); //Vai pegar o primeiro
        //item da primeira lista

//       for(int a = 0;a<bakerylist.size();a++){
//            System.out.println(bakerylist.get(a));
//        }
    }
}
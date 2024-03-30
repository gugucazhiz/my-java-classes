package BeeCrowd;

public class FamiliaJ {
    public static void main(String[] args) {
        Junior eullerPai = new filhoJunior(); //upper cast de classe
        eullerPai.Trair(); //agora euller tem acesso aos metodos de junior ja que houve o uppercast

        filhoJunior nayara = new filhoJunior();
        
        doFamily(nayara);
        //same estate(is about the inputs) and same behavior(is about the methods inside that class)

        //como é down cast precisa colocar esse
        //(filhojunior) ja que ele esta descendo signifca que precisa deixar explicito

        
        Junior[] familiaJunio = new Junior[] {new filhoJunior(), new Junior()};
    System.out.println("\n \n --------------------------");
    for(Junior i : familiaJunio){
        i.Trair();
    }
    System.out.println("\n \n --------------------------");
    }

    public static void doFamily(Junior junior){
        filhoJunior Juniofilho = (filhoJunior)junior;
        Juniofilho.serFilho();
    }


    

}

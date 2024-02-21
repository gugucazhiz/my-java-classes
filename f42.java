import java.util.ArrayList;

public class f42 {
    // polymorphism == greek word for poly - "many", morph-"form"
    //  The ability of an object to identify as more than one type
    public static void main(String[] args) {

        
    Nayara nay = new Nayara();
    Gustavo guga = new Gustavo();

    Dating[] couples = {nay,guga};

    for(Dating icouple : couples){ //para cada objeto icouple dentro de couples print icouple
        //ele conta quantas elementos couples tem e por cada novo elemente que ele passa ele absorve seu
        //content
        icouple.ama();
        System.out.println(icouple);
    }


    }
    
}

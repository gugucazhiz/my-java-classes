public class f19 {
    public static void main(String[] args){
        //primitive is faster // wrapper are reference data and is slower
        //
        //primitive          wrapper
     //------------------------------
        // boolean           Boolean
        // char              Character
        // int               Integer
        // double            Double

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "GUGU";
        
        //wrapper provides a way to use primitive data types as reference data types
    //refence data types contai useful methods
    //can be used with collections


    //exemple
    b.toUpperCase(0); //var "b" of type Character using one method
    
    int k = 123;
    //se eu quisesse atribuir um method diretamente a esse k me retornaria um erro
    //
    // k.toUpperCase() daria erro!!!

    //they are still primitive because of the "unboxing"
    if(a==true){
        System.out.println("This is true");
    }
        
    }

}

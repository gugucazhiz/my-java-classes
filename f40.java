public class f40 {
    public static void main(String[] args) {
        Enc40 enc = new Enc40("Rua doutor marquemburgue","Centro",38);
        Enc40 enc2 = new Enc40("Rua 27 de março","Centro",33);
        Enc40 enc3= new Enc40(enc2); // vai cair
        //on the costructor below the main;

        
        enc2.copy(enc);


        System.out.println(enc.getNumerocasa());
        System.out.println(enc2.getNumerocasa());
    }
}

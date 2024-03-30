package BeeCrowd;

public class donoCarroca {
    public static void main(String[] args) {
        Carroca carroca = new Carroca("Vermelho", "Celta", 20.5,30d);

        System.out.println(carroca);

        carroca.setValorMax();

        Carroca carroca2 =new Carroca("Preto","Civic",12.4,40.0);
        System.out.println(carroca2);
        carroca2.setValorMax();
    }
}

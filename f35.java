public class f35 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Bear bear = new Bear();

        turtle.go(); //as funçoes podem ser acessadas por ambos
        bear.go(); //ou por qualquer outra classe que herde a classe pai

        System.out.println(bear.BearColor); //entretanto
        //cada variavel dessa
        //é unica para cada classe 
        System.out.println(turtle.TurtleColor);
    }
}

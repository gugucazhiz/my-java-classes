public class Urso implements Predator,Prey{

    @Override
    public void flee() {
        System.out.println("This bear is fleeing");
    }

    @Override
    public void Attack() {
        System.out.println("This bear is hunting");
    }
    
}

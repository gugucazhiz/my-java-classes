public class Filho extends Mae {


    String power;

    Filho(String name , int age , String power){
        super(name,age);
        this.power = power; //o this se refere ao argumentos dessa 
                            //classe, e o "super" para a parents classe
                            //nesse caso a classe (mae)
    }
    public String toString(){
        return super.toString() + "\n" + this.power+"\n";
    }
    public void moms(){
        System.out.println(super.tomoms());
    }
}
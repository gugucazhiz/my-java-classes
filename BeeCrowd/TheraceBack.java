package BeeCrowd;
import java.util.*;

public class TheraceBack {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> tabela = new ArrayList<Integer>();
    int velocity;
    int max;
    TheraceBack(int quantity){
        for(int i =1;i<=quantity;i++){
            System.out.println("Digite algum valor: ");
            int valor = scan.nextInt();
            tabela.add(valor);
            System.out.println("Numero "+ i +" É "+ valor);
        }
    }
    public void verif(){
        max = Collections.max(tabela);
        
        if(max<10){
            velocity=1;
        }
        else if(max>=10 && max<=20){
            velocity=2;
        }
        else if(max>=20){
            velocity=3;
        }
        System.out.println("Velocidade maxima:"+velocity);
        System.out.println(Collections.max(tabela) + " "+tabela);
    }
}

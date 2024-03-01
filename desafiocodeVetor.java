import java.util.Scanner; 
public class desafiocodeVetor {


public static void main(String[] args){
    Scanner leitor = new Scanner(System.in); 
    int t = leitor.nextInt(); 
   // int[] numero = new int[t+1];
   // for(int i=0; i <= t;i++){
   //     numero[i] = i;
   //     System.out.println(i);
   // }

        int[] vetor = new int[1000];
        for(int i = 0; i <= 999 ; i++){
            for(int ii=0; ii < t; ii++){
                if(i == 1000){
                    break;
                }
                vetor[i] = ii;
                System.out.println("N"+"["+i+"]"+"="+ii);
                i++;
            }
            i--;

        }
    
    }
}


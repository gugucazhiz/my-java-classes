import java.util.Scanner; 
public class desafiocodeVetor {
    // Abaixo segue um exemplo de código que você pode ou não utilizar:

public static void main(String[] args){
    Scanner leitor = new Scanner(System.in); 
    int contagem =0;
    int t = leitor.nextInt(); 
   // int[] numero = new int[t+1];
   // for(int i=0; i <= t;i++){
   //     numero[i] = i;
   //     System.out.println(i);
   // }
// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int[] vetor = new int[2000];
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


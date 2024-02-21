import java.util.ArrayList;
import javax.net.ssl.TrustManagerFactorySpi;
import javax.swing.JOptionPane;

public class prompt{

    public static String name1;
        //object = an instance of a class that may contain
        //attributes and methods

        //example (phone,desk,computer,coffe cup)   
        public static void main(String[] args) {
            
        
        name1 = JOptionPane.showInputDialog(null,"Insert Player Name 1: ","Menu",JOptionPane.INFORMATION_MESSAGE);
        ArrayList<String> valores = new ArrayList<>();
        while(name1 != null){
            System.out.println(name1);

            if(valores.contains(name1) || name1.isEmpty()){
                JOptionPane.showMessageDialog(null,"Error! Invalid Name.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                valores.add(name1);
            }
            name1 = JOptionPane.showInputDialog(null,"Insert Player Name 1","Menu",JOptionPane.INFORMATION_MESSAGE);
            
            
        }

        
    }
       
/* 
    System.out.println("\n----------------");
    for(int a=0;a < valores.size();a++){
        System.out.println(valores.get(a));
    }*/
    
    }





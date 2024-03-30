import java.util.Scanner;

import javax.swing.JOptionPane;

public class f54trycatch {
    public static void main(String[] args) {
        Boolean continue3 = true;
        do{
        String a=JOptionPane.showInputDialog(null, "Digite VALOR 1");
        String b =JOptionPane.showInputDialog(null,"Numero 2 ");
        try {
        int c = Integer.parseInt(a) / Integer.parseInt(b);
        System.out.println(c);
        continue3 = false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Entrada Invalida Digite Valor Valido '"+e.getMessage()+"'");
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null,"Impossivel dividir por 0");
        }
        finally{
            System.out.println("Mesmo dando exception ou não ele funcionara");
        }}
        while(continue3);
        
    }
}

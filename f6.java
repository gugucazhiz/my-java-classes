//import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class f6 {
    public static void main(String[] args) {
    //    Scanner leitor = new Scanner(System.in);     
    //    System.out.println("Teste 123: ");
    //    String armazem = leitor.nextLine();
    //    System.out.println(armazem);

    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, "Your name is: "+name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("Are is your age? "));
    JOptionPane.showMessageDialog(null,"Your age is: "+age);

    System.out.println("YOU ARE "+name+" and your age is "+age);
    
    int i = JOptionPane.showConfirmDialog(null, "Texto","Titulo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
    //another teste 
    ImageIcon icon = new ImageIcon("C:/Users/gusta/OneDrive/Área de Trabalho/icon.jpeg");
    int input = JOptionPane.showConfirmDialog(null, "Do you like windows?","Windows 7",
    JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,icon);



    }
}

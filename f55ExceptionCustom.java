import javax.swing.JOptionPane;

public class f55ExceptionCustom {
    public static void main(String[] args) throws exececaoException {
        int recebeA =0;
        String a =JOptionPane.showInputDialog(null, "Mensagem abaixo");
        String b =JOptionPane.showInputDialog(null, "Mensagem abaixo");
        try{
             recebeA = Integer.parseInt(a) + Integer.parseInt(b);
        }
        catch(NumberFormatException e){
            throw new exececaoException(a, b);
        }
        finally{
            System.out.println(recebeA);
        }
    }
}

class exececaoException extends Exception {
    private String testea;
    private String testeb;

    public exececaoException(String testea, String testeb){
        super("Não foi possivel somar"+testea+" Com "+testeb);
        this.testea = testea;
        this.testeb = testeb;
    }

    public String toString(){
        return "ESSE VAI SOBRE-ESCREVER O TO STRING DE 'EXCEPTION'"+"\n" +testea+" + "+
        testeb;
    }
}

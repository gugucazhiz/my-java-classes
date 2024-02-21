public class Encape{
    private int valorsecreto1;
    private int valorsecreto2;


    public Encape(int valor1, int valor2){
        this.setValor1(valor1);
        this.setValor2(valor2);
    }

    public int getValue1(){
        return valorsecreto1;
    }
    public int getValue2(){
        return valorsecreto2;
    }
    public void setValor1(int valor1){
        this.valorsecreto1 = valor1;
    }
    public void setValor2(int valor2){
        this.valorsecreto2 = valor2;
    }
}

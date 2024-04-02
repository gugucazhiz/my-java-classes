public class ExceptionDivisao extends Exception{
    int numero1;
    int numero2;

    ExceptionDivisao(int numero1,int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String toString(){
        return "Divisão não possivel entre: "+"\n"+
        numero1+" / "+ numero2+" Pois resultado não sera inteiro.";
    }
}

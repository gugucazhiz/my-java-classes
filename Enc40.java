public class Enc40 {
    private String bairro;
    private String rua;
    private int numeroCasa;

    Enc40(String rua, String bairro, int numeroCasa){
        this.changeNumerocasa(numeroCasa);
        this.changeBairro(bairro);
        this.changeRua(rua);
    }
    Enc40(Enc40 x){
        this.changeNumerocasa(x.getNumerocasa());
        this.changeBairro(x.getBairro());
        this.changeRua(x.getRua());
    } //this constructor will gonna get the class object and copy from
    //the other one


    public String getRua(){
        return rua;
    }
    public String getBairro(){
        return bairro;
    }
    public int getNumerocasa(){
        return numeroCasa;
    }

    public void changeNumerocasa(int numerocasa){
        this.numeroCasa = numerocasa;
    }
    public void changeBairro(String bairro){
        this.bairro = bairro;
    }
    public void changeRua(String rua){
        this.rua = rua;
    }
    public void copy(Enc40 x){
        this.changeNumerocasa(x.getNumerocasa());
        this.changeBairro(x.getBairro());
        this.changeRua(x.getRua());
    }
}

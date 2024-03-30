package BeeCrowd;

public class Carroca {
    private String cor;
    private String modelo;
    private Double tanque;
    private Double valorMax;


    Carroca(String modelo){
        setModelo(modelo);
    }
    Carroca(String cor,String modelo,Double tanque,double valorMax){
        setTanque(tanque);
        setCor(cor);
        setModelo(modelo);
        this.valorMax = valorMax;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public void setTanque(Double tanque){
        this.tanque = tanque;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setValorMax(){
        Double falta = valorMax - tanque;
        System.out.println("O tanque esta com: "+tanque+" Litros"+" Falta: "+falta+" Para completar.");
    }

    public String getModelo(){
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public Double getTanque(){
        return this.tanque;
    }
    public Double getValorMax(){
        return this.valorMax;
    }

    public String toString(){
        return "\n\nCarro: "+modelo+"\nCor: "+cor+"\nCapacidade Atual: "+tanque+"\nCapacidade Maxima: "+valorMax+"\n";
    }
}

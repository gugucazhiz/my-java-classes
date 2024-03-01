package BeeCrowd;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class tarefaCollections {
    //Exercícios Propostos

//Faça um programa que receba a temperatura média dos 6
//primeiros meses do ano e armazene-as em uma lista.

//Após isto, calcule a média semestral das temperaturas e
////mostre todas as temperaturas acima desta média, e em que
//mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
//– Fevereiro e etc).
public static void main(String[] args) {
    int m3 =0;
    int m2 =1;
    int m1 =2;
    DecimalFormat format = new DecimalFormat("#.##"); // formatar decimais
    List<chuvaMeses> chuva = new ArrayList<>(){{
        add(new chuvaMeses("Janeiro", 54d, 14));
        add(new chuvaMeses("Feveiro",20d,10));
        add(new chuvaMeses("Março", 30d, 12));
        add(new chuvaMeses("Abril", 32d, 12));
        add(new chuvaMeses("Maio", 16d, 22));
        add(new chuvaMeses("Junho", 70d, 25));
        add(new chuvaMeses("Julho", 80d, 23));
        add(new chuvaMeses("Agosto", 12d, 3));
        add(new chuvaMeses("Setember", 23d, 17));
        add(new chuvaMeses("Outubro", 18d, 4));
        add(new chuvaMeses("Novembro", 75d, 8));
        add(new chuvaMeses("Dezembro", 56d, 21));
    }};
    //Utilizando For
    for(chuvaMeses mes : chuva){
        System.out.println(mes.getMes());
    }

   

    //Utilizando iterator
    System.out.println("=====================Iterator =====================");
    Iterator<chuvaMeses> iterator = chuva.iterator();
    while (iterator.hasNext()) {
        chuvaMeses proximo = iterator.next();        
        if(m3 == 2 || m3 == 5 || m3 == 8 || m3 == 11){
            m1-=2;
            m2-=2;
            m3-=2;
            Double media =proximo.mediaTrimestral(chuva.get(m3).getPrecip(),chuva.get(m2).getPrecip(),chuva.get(m1).getPrecip());
            System.out.println("Media dos meses :"+chuva.get(m3).getMes()+chuva.get(m2).getMes()+chuva.get(m1).getMes()+" =="+ format.format(media) );
            m1+=2;
            m2+=2;
            m3+=2;
        }
        m3++;
        m2++;
        m1++;
        System.out.println(proximo);
        
    }
    System.out.println(10%2);
    
}


}

class chuvaMeses {
    private String mes;
    private Double precipitacao;
    private int diasNublados;

    public chuvaMeses(String mes, Double precipitacao, int diasNublados){
        this.mes = mes;
        this.precipitacao = precipitacao;
        this.diasNublados = diasNublados;
    }
    public Double mediaTrimestral(Double precipitacaom1,Double precipitacaom2,Double precipitacaom3){
        Double media = (precipitacaom1 + precipitacaom2 + precipitacaom3)/3;
        return media;
    }
    public String getMes(){
        return this.mes;
    }

    public Double getPrecip(){
        return this.precipitacao;
    }

    public int getDiasNublados(){
        return this.diasNublados;
    }

    public String toString(){
        return "Mes: "+mes+"\nPrecipitação: "+precipitacao+"\nDiasNub: "+diasNublados+"\n";
    }
}
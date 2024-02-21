package LeetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraysome {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        int pos;
        int valadd;
        valores.add(1);  
        valores.add(0); 
        valores.add(8);
        
        for(int i =0;i< valores.size(); i++){
            pos = valores.get(valores.lastIndexOf(valores.getLast())-i);
            if(pos== 9){
                valadd = 0;
                valores.set(valores.lastIndexOf(valores.getLast())-i,valadd);
            }
            else{
                valadd = 0;
                valadd = valores.get(valores.lastIndexOf(valores.getLast())-i) +1;
             valores.set(valores.lastIndexOf(valores.getLast())-i,valadd);
                break;
            }
        }

        System.out.println(valores);
    }
}

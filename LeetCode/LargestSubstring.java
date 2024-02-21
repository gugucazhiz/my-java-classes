package LeetCode;

import java.util.ArrayList;
import java.util.*;

public class LargestSubstring {
    static String a = "fafdgkioa";
    static ArrayList<String> caracter =new ArrayList<>();
    static ArrayList<String> caracter2 =new ArrayList<>();
    static String b="";
    static int aa;

    public static void main(String[] args) {
            for(int i =0; i<a.length();i++){
                b = String.valueOf(a.charAt(i));
                caracter.add(b);
                System.out.println(caracter.get(i));
            }       
            for(int a= caracter.size()-1; a <= caracter.size() ; a--) {
                for (int i = 0;i<caracter.size()-1;i++){
                    System.out.println(caracter.get(a));
                    System.out.println(caracter.get(i));
                    if (caracter.get(i).equals(caracter.get(a))) {
                        System.out.println("Letra: " +caracter.get(a)+" igual na posição "+i+" e "+a);
                        System.out.println("Distancia entre primeiro e ultimo termo: "+ ((a-i)-1));
                        System.out.println("O Termo "+caracter.get(i)+" É repetido "+Collections.frequency(caracter, caracter.get(a))+ " Vezes.");
                        break;
                    }
                }
                break;
            }    
            System.out.println("\n"+"----------------");
        }
}

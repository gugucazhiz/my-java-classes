public class f18 {
    public static void main(String[] args) {
        // String = a refence data type that can store one or more
        //characteres 
        //            reference data types have acess to useful methods
    /* 
        String[][] a = new String[3][2];

        a[0][0] = "peeee";
        a[0][1] = "peeee2";
        a[1][0] = "peeee3";
        a[1][1] = "peeee4";
        a[2][0] = "peeee5";
        a[2][1] = "peeee6";
        System.out.println(a[0][0]);

        for(int i=0;i <a.length;i++){
            System.out.println();
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
            
        }
        */
        String name = "Bro ";

        boolean result = name.equals("Bro");
        //a variavel "name" é equivalante a este input? essa resposta vai ser
        //armazenada na variavel "result"
        int size = name.length();
        //vai medizr o tamanho da variavel "name" ele conta espaçoes aswell
        char pos = name.charAt(1);
     //vai pegar o character of the position 2 because it starts counting from 0
        int find = name.indexOf("ro");
        //vai te retornar a posição desses valores
        boolean isorNot = name.isEmpty();
        //ta vazio or not
        String caixaalta = name.toUpperCase();
        //transformar em maiusculo para minusculo é lowercase()
        String semEspaco = name.trim();
        //entfernen the espaços
        String troca = name.replace('o','a' );

        System.out.println(result);
        System.out.println("o tamanho é "+size);
        System.out.println(pos);
        System.out.println(find);
        System.out.println(isorNot);
        System.out.println(caixaalta);
        size = semEspaco.length();
        System.out.println(semEspaco + "o tamanho agora é: "+ size);
        System.out.println(troca);

    }
}

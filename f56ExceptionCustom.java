public class f56ExceptionCustom {
    public static void main(String[] args) throws ExceptionDivisao {
        int[] a = {10,5,60,70};
        int[] b = {2,4,3,5};

        for(int i =0; i < b.length ; i++){
            if(a[i] %2 != 0) throw new ExceptionDivisao(a[i], b[i]);
            int resultado = a[i] / b[i];
            System.out.println(resultado);
        }
    }
}

public class f17{
    public static void main(String[] args) {
        // 2d array

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Civic";
        cars[1][0] = "Opala";
        cars[1][1] = "Ram";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Buggati";
        cars[2][2] = "Rolls royace";

        for(int i=0;i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }
        //another way of doing it

        String[][] Leal ={
                          {"Fechar","O Ano","A cara","O Sorriso"},
                          {"Fechar","Contrato","Apoio"}
                        };

        System.out.println("\n");
         for(int a=0;a<Leal.length;a++){

            System.out.println();

            for(int b=0;b<Leal[a].length;b++){
                System.out.print(Leal[a][b]+" ");
            }
        } 

        for(int x=0;x<Leal.length;x++){
            System.out.println();

            for(int b=0;b<Leal[x].length;b++){
                System.out.println(Leal[x][b]);
            }
        }
    }
}
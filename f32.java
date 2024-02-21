public class f32 {
    public static void main(String[] args) {
        /*
        int[] numbers = new int [3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        strings[0] = "HAHAHA";
        for(int k=0;k < strings.length;k++){
            System.out.println(strings[k]);
        }
        */
        //obejct array

        //Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Lasangna");
        Food food3 = new Food("Peperonni");

        Food[] refrigerator = {food1,food2,food3};
        
       // refrigerator[0] = food1;
       // refrigerator[1] = food2;
       // refrigerator[2] = food3;

        for(int a=0;a<refrigerator.length;a++){
            System.out.println(refrigerator[a].name);
        }
    }
}

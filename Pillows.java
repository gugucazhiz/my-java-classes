public class Pillows {

    String name;
    static int numberOfFriends;

    Pillows(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void Displaynames(){
        System.out.println("You have: "+numberOfFriends+" Pillows");
    }
}

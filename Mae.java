public class Mae {
    String name;
    int age;
    
    Mae(String name, int age ){ //or argumentos de super() vem para ca
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + "\n" + this.age;
    }
    public String tomoms(){
        return this.name;
    }
}

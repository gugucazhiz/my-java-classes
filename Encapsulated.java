public class Encapsulated {
    
    private String make;
    private String model;
    private int year;

    Encapsulated(String make, String model, int year){
        this.setYear(year);
        this.setMake(make);
        this.setModel(model);
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int year(){
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }
}


public class cartype {
    private String make;
    private double capacity;
    private String model;

    public cartype(String make, String model, double capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    public String toString(){
        return String.format("%-10s\t%-10s\t%-10s", make, model, capacity);
    }
}

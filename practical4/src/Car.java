
public class Car {
     private String carPlane;
    private int year;
    private String color;
    

    public  Car(String carPlane, String color, int year) {
        this.carPlane = carPlane;
        this.color = color;
        this.year = year;
        
    }
    public String toString(){
        return String.format("%-11s\t%-10s\t%5s ",carPlane, year,color);
    }
}

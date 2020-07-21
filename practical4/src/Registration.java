
public class Registration {
     static int nextregNo = 1001;
    private int regNo;
    private Car car;
    private cartype cartype;
    private owner owner;

    public Registration(Car car, cartype cartype, owner owner) {
        this.car = car;
        this.cartype = cartype;
        this.owner = owner;
        regNo = nextregNo;

        nextregNo++;
    }

    public String toString() {
        return String.format("%d %s %s %s", regNo, owner.toString(),car.toString(),cartype.toString());
    }
    
}

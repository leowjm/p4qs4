
import java.util.Scanner;

public class TestCarRegistration {

    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType objects
        cartype[] typeList = {
            new cartype("Toyota", "Vios", 1.5),
            new cartype("Nissan", "Teana", 2.0),
            new cartype("Honda", "City", 1.6)
        };

//todo:: create an array that will able to store 6 registrations
        Registration[] reg = new Registration[1];
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < reg.length; ++i) {

            System.out.println("\nRegistration number: " + Registration.nextregNo);

            //todo:: request and read the owner detail
            System.out.print("Enter owner name : ");
            String name = scanner.nextLine();

            System.out.print("Enter IC number : ");
            String icNo = scanner.nextLine();

            //construct owner object
            owner owner = new owner(name, icNo);

            //todo:: request and read car detail    
            System.out.print("Enter car plate number : ");
            String carPlane = scanner.nextLine();

            System.out.print("Enter color: ");
            String color = scanner.nextLine();

            System.out.print("Enter year : ");
            int year = scanner.nextInt();

            //construct owner object
            Car car = new Car(carPlane, color, year);

            System.out.println("\nCar Types: ");
            //todo:: display all available carType
            for (int x = 0; x < typeList.length; x++) {
                System.out.println((x + 1) + ". " + typeList[x].toString());
            }

            System.out.print("\nSelect car type [1.." + typeList.length + "]: ");
            int selection = scanner.nextInt();

            //todo:: get cartype from array (based on selection)
            cartype selectedType = typeList[selection - 1];

            //todo:: register the car
            Registration newReg = new Registration(car, selectedType, owner);
            reg[i] = newReg;
            scanner.nextLine();
        }

        //todo:: display all registration detail
        displayListing(reg);
    }

    public static void displayListing(Registration[] regArr) {
        System.out.printf("\n\n%50s\n", "Car Registration Listing");
        System.out.printf("%50s\n","------------------------------");
        System.out.printf("%-12s %-12s %-12s %-10s %-8s %-8s %-10s %-10s %5s\n",
                "Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
        for (int i = 0; i < regArr.length; ++i) 
            System.out.println(regArr[i]);
        }
    }


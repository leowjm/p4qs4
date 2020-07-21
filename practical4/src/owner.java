
public class owner {

    private String name;
    private String icNo;

    public owner(String name, String icNo) {
        this.name = name;
        this.icNo = icNo;
    }
    
     public String toString(){
        return String.format("%-15s\t%-10s", name, icNo);
    }
}

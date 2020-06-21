import java.util.Scanner;

public class tutorial1qs5 {
    
    static void showOddNumber(){       
        
        int minNum, maxNum;
        int sumNum = 0;
        Scanner scan = new Scanner(System.in);
        
       
        System.out.print("Enter Min Value: ");
        minNum = scan.nextInt();
        
        System.out.print("Enter Max Value: ");
        maxNum = scan.nextInt();
        
        
        for(int x = minNum; x <= maxNum; x++){
            if(x == 0){
                System.out.print("Number Can't Start With 0!!\n");
                break;
            }
            else if(x == 1 || x % 2 != 0){
                System.out.print(x + " ");
                sumNum += x;
            }
           
        }
        System.out.print("\nTotal : " + sumNum + "\n");
        
        
    }
    
    public static void main(String[] args){
       showOddNumber();
    }
    
}

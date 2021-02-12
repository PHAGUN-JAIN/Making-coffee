package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int n = in.nextInt();
        System.out.println("For " + n + " cups of coffee you will need:");
        System.out.println((n*200) + " ml of water");
        System.out.println((n*50) + " ml of milk");
        System.out.println((n*15) + " g of coffee beans");
        
    }
}

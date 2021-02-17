
package machine;
import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {
      /*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int n = in.nextInt();
        System.out.println("For " + n + " cups of coffee you will need:");
        System.out.println((n*200) + " ml of water");
        System.out.println((n*50) + " ml of milk");
        System.out.println((n*15) + " g of coffee beans");
        */
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = in.nextInt();
        
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = in.nextInt();
        
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = in.nextInt();
        
        System.out.println("Write how many cups of coffee you will need:");
        int n = in.nextInt();
        
        in.close();
        
        int N = Math.min(Math.min(water/200, milk/50), beans/15);
        
        if (N == n){
          System.out.println("Yes, I can make that amount of coffee");
        }
        else if (N > n){
          System.out.println("Yes, I can make that amount of coffee (and even " + (N - n) + " more than that)"); 
        }
        else if (N < n ){
           System.out.println("No, I can make only " + (N) + " cup(s) of coffee" ); 
        }
        
    }
}

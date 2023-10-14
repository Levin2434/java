import java.util.Scanner;

public class levin {
    public static int printCalculate(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args){
        
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(printCalculate(a, b));
        }
    }
    
}

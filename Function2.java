import java.util.*;

public class Function2 {
    public static void PrintHelloWorld(){
        System.out.println("Hello World ");
        System.out.println("Hello World ");
        return;
    }
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum; 
    }
    public static void main(String[] args) {
        PrintHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b);        
        System.out.println("Sum of a AND b :" + sum);
    }
}

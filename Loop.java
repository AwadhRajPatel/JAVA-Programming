import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // while loop
/*
    Reverse the given number n =10899

        int n = 10899;
    int rev =0;
    while (n>0) {
        int lastDigit = n%10;
        rev =(rev*10)+lastDigit;
        n=n/10;
    }
    System.out.println(rev);
*/

/*
     * Print Reverse of a number: n=10899
     
      int n = 10899;

      while (n>0) {
        int lastDigit = n%10;
        System.out.print(lastDigit);
        n = n/10;
      }
      System.out.println();
        */

/* 
 * Print sum of first n Natural number
 */
System.out.println("Enter any number");
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
  int sum = 0;
 int i =1;
 while (i <=n) {
    sum +=i;
    i++;
 }
 System.out.println("Sum total Natural Number " + sum);

/* 
// Print 1 to N number
       System.out.println("Enter the number : ");
      Scanner sc = new Scanner(System.in);
      int range = sc.nextInt();
      
      int counter = 1;

      while (counter <= range) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
*/

/* 
    int num = 1;
    while (num<=10) {
        System.out.println("Pritn the one to Ten = " + num);
        num++;
    }
*/
/*     int count =0;
     while (count<100) {
        System.out.println("Hello world");
        count++;
     }   
     System.out.println("Print Hw 100x ");
    }
     */ 
}
}

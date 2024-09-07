import java.util.*;

public class ConditionalStatement{
    
  public static void main(String args[]){
/*
 *Question:  Calculator make problem
 */
Scanner sc = new Scanner(System.in);
  System.out.println("Enter the a:");
  int a = sc.nextInt();
  System.out.println("Enter the numbe b :");
  int b = sc.nextInt();
  System.out.println("Enter the operator:");
  char operator = sc.next().charAt(0);

  switch (operator) {
    case '+': System.out.println(a+b);
              break;
    case '-': System.out.println(a-b);
              break;
    case '*': System.out.println(a*b);
             break;
    case '/': System.out.println(a/b);
              break;
    case '%': System.out.println(a%b);
             break;
    default: System.out.println("Error print");
             break;
  }




/*
 * Switch Statement concept
 
int number =2;
 switch (number) {
  case 1:
  System.out.println("Samosa");
         break;
  case 2:
  System.out.println("Burger");
         break;
  case 3:
  System.out.println("MangoShake");
         break;
  default:
  System.out.println("We are asomeing dream");
 } 

* output:Burger/  

/** 
        * Ternary Operator Concept
        
          int marks =67;
          String reportCard = marks >=33 ? "PASS" : "FAIL";
          System.out.println(reportCard);

        int number =5;
         String type = ((number%2) == 0)? "Even": "Odd";
         System.out.println(type);
*/ 


/**
       * Question no: print the largest of 3 Number
       
      int A =1, B =2, C =6;
      if ((A >= B) && ( A >= B)) { 
        System.out.println("Largest is B");
      }
      else if (B >= C) {
        System.out.println("Largest is B");
      }
      else{
        System.out.println("Largest is C");
      }
*/

/**
     * else if concept
     
    int age = 13;

    if(age>=18){
      System.out.println("adult" );
    }
    if(age >= 13 && age < 18){
      System.out.println("Teenager");
    }
    else{
      System.out.println("Child");
    }
*/


/**
       * Question No 3: Odd and Even
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();

        if (number %2 == 0) {
          System.out.println("Even");
        }else{
          System.out.println("Odd");
        }
*/

/**
       * Second Problem  Largest number A > =B
       * 
      int A = 10;
      int B = 5;
      if (A >= B) {
        System.out.println("A is largest of 2");
      }else{
      System.out.println("B is largest of 2");
      }      
*/


/* first problem in if else*

      int age = 22;
      if(age>=18){
        System.out.println("adult: Vote, drive" );
      }
      if(age > 13 && age< 18){
        System.out.println("Teenager");
      }
      else{
        System.out.println("Not adult");
      }
*/


    }
}
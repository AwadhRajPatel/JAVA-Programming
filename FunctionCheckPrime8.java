public class FunctionCheckPrime8 {
    
//   Optimized code
   public static boolean isPrime(int n){
    if (n == 2) {
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if (n % i == 0) {
            return false;
        }
    }
    return true;
   }


    // only for n>=2
    /* 
    public static boolean isPrime(int n){
        // conner case
        // 2
        if (n==2) {
            return true;
        }

       for(int i=2; i<=n-1; i++){
        if (n % i == 0) {
            return false;
        }
       }
       return true;
    }
*/ 

    public static void main(String[] args) {
       System.out.println(isPrime(6));
        // System.out.println(isPrime(5));
    }
}
 
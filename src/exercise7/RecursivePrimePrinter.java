package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
       
       if(n ==0){
         return 0;
       }

       if(isPrime(n)){
         System.out.println(n);
       }
       
       printPrimes(n: n-1);
        // Implement recursive method
    }

    public static boolean isPrime(int n) {
        long divider = 2;
        while(divider<= n/2){
          if(n % divider ==0){
            return false;
          }
          divider++;
        }
          // Implement method
        return true;
    }
}

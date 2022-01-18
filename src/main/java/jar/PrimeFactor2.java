// Vivek Bojja, Sec :30, S ID : 999901375.
//PrimeFactor2.java

import java.util.Scanner;

public class PrimeFactor2 {
    private static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i = 2;i<n;i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        int n,i = 2,input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 111 and 900: ");
        n = scanner.nextInt();

        while(n<111 || n>900){
            System.out.println("Invalid input");
            System.out.print("Enter a number between 111 and 900: ");
            n = scanner.nextInt();
        }

        System.out.print(n+" = ");

        String result = "";

        while (n > 1){
            if(isPrime(i)){
                int count = 0;
                while (n%i == 0){
                    count += 1;
                    n = n / i;
                }
                if(count>0)
                    result += i+"^"+count+"*";
            }
            i++;
        }

        System.out.println(result.substring(0,result.length()-1));
    }
}
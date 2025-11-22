package DSA.Patterns.simplePatterns;
import java.util.Scanner;
import java.util.Scanner;

// Please enter a number
// 5
// 1    
// 01
// 101
// 0101
// 10101


public class ZeroOneTriangle {
          public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j <= i ){
                    if((i+j) % 2 == 0 )
                    System.out.print(1);
                    else 
                        System.out.print(0);
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }



}

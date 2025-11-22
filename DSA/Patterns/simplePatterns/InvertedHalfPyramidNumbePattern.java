package DSA.Patterns.simplePatterns;
import java.util.Scanner;

// Please enter the No.
// 5
// 12345
// 1234
// 123
// 12
// 1



public class InvertedHalfPyramidNumbePattern {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the No.");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i+j <= n-1){
                    System.out.print(j+1);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();   
        }

    }
}

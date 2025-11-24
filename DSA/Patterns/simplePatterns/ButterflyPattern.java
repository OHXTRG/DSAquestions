package DSA.Patterns.simplePatterns;
import java.util.Scanner;
public class ButterflyPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                if( j <= i && i < n/2){
                    /// print half pyramid for half matrix
                    System.out.print("* ");
                }else if (i >= n/2 && i+j <= n-1){
                    /// print half pyramid inverted for half matrix 
                    System.out.print("* ");
                }else if(i < n/2 && j+i >= n-1){
                    /// print rotated half pyramid
                    System.out.print("* ");
                }else if(i >= n/2 && j >= i ){
                    /// print half inverted rotated pyramid
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }



    }
}
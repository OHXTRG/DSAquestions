package DSA.Patterns.simplePatterns;
import java.util.Scanner;
public class FlyodTriangle {
      public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int counter = 1 ; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j <= i ){
                    System.out.print(counter + "  ");
                    counter++;
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }



}

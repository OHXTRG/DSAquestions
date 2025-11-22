package DSA.Patterns.simplePatterns;
import java.util.Scanner;

// Please enter the No.
// 5
//     *
//    **
//   ***
//  ****
// *****

public class InvertedRotatedHalfPyramid {
    

    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the No.");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i+j >= n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

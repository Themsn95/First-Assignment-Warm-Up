import java.util.Scanner;

public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public static long factorial() {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int f = 1 ;
        for (int n = number ; n >= 2 ; n--){
            f *= n ;
        }
        System.out.println(f);
        return 0;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public static long fibonacci() {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int f = 1 , s = 0 , n = 0  ;
        for (int m = 0 ; m<number ; m++ ){
            n = s+f ;
            System.out.print(" " + n);
            s = f;
            f = n ;
        }
        return 0;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public static char[][] generateTriangle() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return null;
    }


    public static void main(String[] args) {
        while (true) {
            System.out.print("\nPress 1 for Factorial\nPress 2 for Fibonacci\nPress 3 for Generate Triangle ");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int number;
            switch (a) {
                case 1:
                    Exercises1.factorial();
                    break;
                case 2:
                    Exercises1.fibonacci();
                    break;
                case 3:
                    Exercises1.generateTriangle();
            }
        }
    }
}
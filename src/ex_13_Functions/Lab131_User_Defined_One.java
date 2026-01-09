package ex_13_Functions;

import java.util.Scanner;

public class Lab131_User_Defined_One {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number a=");
        int a = scan.nextInt();
        System.out.println("Enter a number b=");
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("The sum is " + sum);

    }


    static int sum_two_numbers(int x,int y){
        return x+y;
    }
    static void sum_of_two_number(){
        System.out.println("Hi,there");
    }
}

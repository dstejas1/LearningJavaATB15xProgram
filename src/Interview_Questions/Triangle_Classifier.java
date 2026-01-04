package Interview_Questions;

import java.util.Scanner;

public class Triangle_Classifier {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three side lengths:");
        int a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        if (a==b  && b==c)
        {
            System.out.println("it's Equilateral triangle");
        }
        else if (a==b || b==c || a==c) {
            System.out.println("it's Isosceles triangle");
        }
        else
        {
            System.out.println("it's Scalene triangle");
        }

        scanner.close();
    }
}

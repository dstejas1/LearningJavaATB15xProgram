package ex_09_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("starting the chrome");
                System.out.println("........");
            break;
            case "edge":
                System.out.println("starting edge browser");
            break;
        }
    }
}

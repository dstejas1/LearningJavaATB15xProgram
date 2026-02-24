package Expection;

public class Exception_Explained {
    static void main(String[] args) {
        System.out.println("starting of the program!");
        String input_user = args[0];
        Integer a =  Integer.parseInt(input_user);
        Integer Output = 100/a;
        System.out.println("output user: " + Output);
        System.out.println("End of program! ");
    }
}

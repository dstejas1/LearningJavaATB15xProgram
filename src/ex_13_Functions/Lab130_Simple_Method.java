package ex_13_Functions;

public class Lab130_Simple_Method {

    static void no_return(){
        System.out.println("this is non return type");
    }
    static int return_int(){
        System.out.println("return_int");
        return 10;
    }

    static void main(String[] args) {
        no_return();
        return_int();
    }
}

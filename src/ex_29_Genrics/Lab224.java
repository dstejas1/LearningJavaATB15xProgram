package ex_29_Genrics;

public class Lab224 {
    public static void main(String[] args) {
        temp_sum(3,4);
        temp_sum("pramod","pramod");
    }
    static <pramod> void temp_sum(pramod a, pramod b) {
        System.out.println(a);
        System.out.println(a);
    }
}

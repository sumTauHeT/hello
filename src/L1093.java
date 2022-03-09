import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class L1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();

        StringBuffer stb = new StringBuffer(str);
        StringBuffer reverse=stb.reverse(); 

        System.out.println(reverse.toString());

    }
}

import java.util.Scanner;

public class HUAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        while (n!=0){
            System.out.println(tou(n));
            n=scanner.nextInt();
            if(n==0){
                scanner.close();
                break;
            }
        }
    }

    private static int tou(int n) {
        if(n<=4){
            return n;
        }else
        return tou(n-1)+tou(n-3);
    }
}

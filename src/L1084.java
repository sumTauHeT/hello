import java.util.Scanner;

public class L1084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j;
         int N=scanner.nextInt();
         for( i=2;i<=N;i++){
             for( j=2;j<i;j++){
                 if(i%j ==0)
                     break;
             }
             if(i==j)
                 System.out.println(i);

         }

    }
}

import java.util.Scanner;

public class L2013_9 {

    static int ans;
    private static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N=sc.nextInt();
        int [] arr={1,2,3,4,5,6,7,8,9};

    }

    public static void f(int[] arr,int k){
        if(k==9){
            check(arr);
            return;
        }
        for(int i=k;i<arr.length;i++){
            int t=arr[i];
            arr[i]=arr[k];
            arr[k]=t;

            f(arr,k+1);

            t=arr[i];
            arr[i]=arr[k];
            arr[k]=t;
        }
    }

    private static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    private static void check(int[] arr) {
        for(int i=1;i<=7;i++){
            int num1=toInt(arr,0,i);
            if(num1 >= N) continue;

            for(int j=1;j<=8-i;j++){
                int num2 =toInt(arr,i,j);
                int num3=toInt(arr,i+j,9-i-j);
                if(num2 % num3 ==0 && num1+num2/num3==N){
                    ans++;
                }
            }
        }
    }

    private static int toInt(int [] arr,int pos ,int len){
        int t=1;
        int ans=0;
        for(int i=pos +len -1;i>=pos;i--){
            ans += arr[i]*t;
            t *=10;
        }
        return ans;
    }
}



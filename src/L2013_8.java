import java.util.Scanner;

public class L2013_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i] =2*i+1;
        }

        int l=1;
        while (true){
            int p=l+1;
            for(int i=l+1;i<n;i++){
                if((i+1)%a[l]==0){

                }else {
                    a[p]=a[i];
                    p++;
                }
                if(a[p] >n) break;
            }
            l++;
            if(a[l]>=n) break;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(a[i]>=n) break;
            if(a[i] >m) ans++;
        }
        System.out.println(ans);
    }
}

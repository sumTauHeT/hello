public class L2013_3 {
    public static void main(String[] args) {
        int ans=f(0,0);
        System.out.println(ans);
    }
    private static int f(int i,int j){
        if(i==3 || i==4)
            return 1;
        return f(i+1,j)+f(i,j+1);
    }
}

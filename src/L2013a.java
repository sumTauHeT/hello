public class L2013a {
    public static void main(String[] args) {
        for (int a=3;a<=9;a++){
            for(int b=0;b<=9;b++){
                if(a!=b)
                    for(int c=0;c<=9;c++){
                        int num=a*10 +b*10+c;
                        if(num > 316){
                            int num_num =num*num;
                            int shiwan = num_num/100000;
                            int wan=num_num%100000/10000;
                            int shi=num_num%100/10;
                            int ge=num_num%10;

                            if(a==shiwan && b==ge && wan==shi){
                                System.out.println(" "+a+b+c);
                                System.exit(0);
                            }
                        }
                    }
            }
        }
    }
}

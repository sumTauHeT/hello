import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class L2013_4 {
    public static void main(String[] args) {
        BigInteger a=BigInteger.ONE;
        BigInteger b=BigInteger.ONE;

        for(int i=3;i<500;i++){
            BigInteger t=b;
            b=a.add(b);
            a=t;
        }

        BigDecimal divide =new BigDecimal(a,110).divide(new BigDecimal(b,110),BigDecimal.ROUND_HALF_DOWN);
        System.out.println(divide.toPlainString().substring(0,103));
    }
}

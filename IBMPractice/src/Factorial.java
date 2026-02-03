import java.math.BigInteger;
import java.util.*;

public class Factorial {
    Map<Long, BigInteger> s=new HashMap<>();
    Map<BigInteger,BigInteger> s1=new HashMap<>();
    public BigInteger fact(long a){
        if (a<=1)return BigInteger.ONE;
        if (s.containsKey(a))return s.get(a);
        BigInteger res=BigInteger.valueOf(a).multiply(fact(a-1));
        s.put(a,res);
        return res;
    }

    public BigInteger fact0(BigInteger a){
        if (a.equals(BigInteger.ONE)||a.equals(BigInteger.ZERO))return BigInteger.ONE;
        if (s1.containsKey(a))return s1.get(a);
        BigInteger res=a.multiply(fact0(a.subtract(BigInteger.ONE)));
        s1.put(a,res);
        return res;
    }

    static void main() {
        Factorial factorial=new Factorial();
        BigInteger l=factorial.fact(9000);
        System.out.println(l);
    }
}

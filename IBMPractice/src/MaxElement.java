import java.math.BigInteger;
public class MaxElement {
    public BigInteger bigInteger(BigInteger[] a){
        BigInteger b=a[0];
        for(BigInteger i:a){
            b=b.max(i);
        }
        return b;
    }
}

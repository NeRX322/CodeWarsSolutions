import java.math.BigInteger;
public class SumFct {
  public static BigInteger perimeter(BigInteger n) {
    BigInteger F0 = BigInteger.ZERO;
    BigInteger F1 = BigInteger.ONE;
    BigInteger F2 = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;
    for(int i = 0; i <= n.intValue(); i++) {
      F0 = F1;
      F1 = F2;
      F2 = F0.add(F1);
      sum = sum.add(F0);      
    }
    return sum.multiply(BigInteger.valueOf(4));
  }
}

import java.util.Scanner;
import java.math.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        boolean result;
        bufferedReader.close();
        BigInteger bn = new BigInteger(n);
        result = bn.isProbablePrime(1);
        if(result==true){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}

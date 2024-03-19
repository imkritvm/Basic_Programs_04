import java.util.Scanner;

public class GDC
{
    public static int calcGCD(int a, int b){
        while(a != 0 && b != 0) {
            if(a>b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return Math.max(a,b);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number : ");
	    int n = sc.nextInt();
	    System.out.println("Enter second number : ");
	    int m = sc.nextInt();
	    System.out.println("The Greatest Common Divisor between "+n+" and "+m+" is "+calcGCD(n,m));
	}
}

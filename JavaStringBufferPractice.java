import java.util.Random;
import java.util.Scanner;

class RandString {
    static String generate (int size) {
        StringBuffer sb = new StringBuffer(size);
	    Random ran = new Random();
	    for(int i=0;i<size;i++){
	        int ranchar = 'a' + ran.nextInt(26);
	        sb.append((char)(ranchar));
	    }
	    System.out.println(sb.length());
	    return sb.toString();
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a random number in which you want to create the text :");
	    int input_size = sc.nextInt();
	    Random rd = new Random();
	    String name = RandString.generate(rd.nextInt(input_size));
	    System.out.println(name);
	}
}

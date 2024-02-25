import java.util.regex.*;
import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Type your desired string : ");
	    String input = sc.nextLine();
	    System.out.println("Enter the word which you want to search :");
	    String search = sc.nextLine();
	    Pattern pt = Pattern.compile("\\b"+search+"\\b", Pattern.CASE_INSENSITIVE);
	    Matcher mt = pt.matcher(input);
	    int count = 0;
	    while(mt.find()){
	        count++;
	    }
	    sc.close();
	    if(count>0){
	        System.out.println("Yes, your searched word exists in theinput string.");
	        System.out.print("Your input string is : "+input+"\nAnd this is word you have entered for searching : "+search+"\nThe word exists "+count+" times.");
	    } else {
	        System.out.println("The word which you want to search doesn't exists.");
	    }
	}
}

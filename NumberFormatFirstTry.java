import java.util.*;
import java.text.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		double cV = 123445.5321;
		
		Locale locale1 = new Locale("en", "CN");
		Locale locale2= new Locale("en", "US");
		Locale locale3 = new Locale("en", "IN");
		Locale locale4 = new Locale("en", "FR");
		
		String dL1 = locale1.getDisplayLanguage();
		String dL2= locale2.getDisplayLanguage();
		String dL3 = locale3.getDisplayLanguage();
		String dL4 = locale4.getDisplayLanguage();
	
		NumberFormat cF1 = NumberFormat.getCurrencyInstance(locale1);
		NumberFormat cF2 = NumberFormat.getCurrencyInstance(locale2);
		NumberFormat cF3 = NumberFormat.getCurrencyInstance(locale3);
		NumberFormat cF4 = NumberFormat.getCurrencyInstance(locale4);
		
		String fC1 = cF1.format(cV);
		String fC2 = cF2.format(cV);
		String fC3 = cF3.format(cV);
		String fC4 = cF4.format(cV);
		
		System.out.println("Currency : " + fC1 +" " + dL1);
		System.out.println("Currency : " + fC2 +" " + dL2);
		System.out.println("Currency : " + fC3 +" " + dL3);
		System.out.println("Currency : " + fC4 +" " + dL4);
	}
}

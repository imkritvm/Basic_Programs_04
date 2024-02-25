import java.util.regex.*;
public class JavaRegex
{
	public static void main(String[] args) {
		
		// This one Check the given value in the String.
		String name1 = "Krit";
		Pattern p1 = Pattern.compile(".*r.*");
		Matcher m1 = p1.matcher(name1);
		if(m1.matches()){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		// This one Check the ending of string
		String name2 = "Krit";
		Pattern p2 = Pattern.compile(".r");
		Matcher m2 = p2.matcher(name2);
		if(m2.matches()){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");	
		}
		// One Line Code 1
		System.out.println(Pattern.compile(".*r.*").matcher(name1).matches());
		// One Line Code 2
		System.out.println(Pattern.matches(".*r.*",name1));
		System.out.println(Pattern.matches(".r..",name1));
		System.out.println(Pattern.matches("[a-z]","h"));
		System.out.println(Pattern.matches(".*[a-zA-Z].*","Hg"));
		System.out.println(Pattern.matches("[a-d[m-p]]","n"));

		// Another Line Code
		System.out.println(Pattern.matches("[a-z&&[def]]","z"));
		System.out.println(Pattern.matches("[a-z&&[^def]]","z"));
        
        // Regex Quantifiers
        System.out.println(Pattern.matches("[^ri]?","i"));
        System.out.println(Pattern.matches("[ri]?","i"));
        System.out.println(Pattern.matches("[ri]?","ri"));
        System.out.println(Pattern.matches("[ab]+","abbas"));
        System.out.println(Pattern.matches("[ab]+","abba"));
        System.out.println(Pattern.matches("[^ab]*","ababaababab"));
        System.out.println(Pattern.matches("[ab]*","ababasbabab"));
        System.out.println(Pattern.matches(".*K{1}.*",name1));
        System.out.println(Pattern.matches("a{1,5}","aaaaaaaa"));
        System.out.println(Pattern.matches("a{1,}","aaaaaaaaaaaaaaaaaa"));
        System.out.println(Pattern.matches("[^a{1,}]","aaaaaaaaaaaaaaaaaa"));
        System.out.println(Pattern.matches("a{3,8}","aaaaaaaa"));
        
        // Regex Metacharacters  {only for 0-9, for printing more than 1 digit add "*"}
        System.out.println(Pattern.matches("\\d","12"));
        System.out.println(Pattern.matches("\\d","1"));
        System.out.println(Pattern.matches("\\d*","13414541"));
        System.out.println(Pattern.matches("\\D","1"));
        System.out.println(Pattern.matches("\\D","A"));
        System.out.println(Pattern.matches(".*","ullu"));
        System.out.println(Pattern.matches(".","ullu"));
        System.out.println(Pattern.matches(".","7"));
        System.out.println(Pattern.matches(".","80"));
        
        // {\s and \S}
        System.out.println(Pattern.matches("\\s","\t"));
        System.out.println(Pattern.matches("\\s","\t\t"));
        System.out.println(Pattern.matches("\\s","a"));
        System.out.println(Pattern.matches("\\s*","   "));
        System.out.println(Pattern.matches("\\S","a"));
        System.out.println(Pattern.matches("\\S","sb"));
        System.out.println(Pattern.matches("\\S*","sgab"));
        System.out.println(Pattern.matches("\\S"," "));
        
        // {\w and \W (@,!,.,$,%)}
        System.out.println(Pattern.matches("\\w","b"));
        System.out.println(Pattern.matches("\\w","9"));
        System.out.println(Pattern.matches("\\w","wer"));
        System.out.println(Pattern.matches("\\w*","wer"));
        System.out.println(Pattern.matches("\\w*","132jkds@"));
        System.out.println(Pattern.matches("\\W","@"));
        System.out.println(Pattern.matches("\\W*","$@"));
        System.out.println(Pattern.matches("\\W","4"));
        
        // Alpha numeric Metacharacters
        System.out.println(Pattern.matches("\\w{1,}","Juki"));
        System.out.println(Pattern.matches("\\S{1,}","Juki"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{1,}","Krit Vardhan Mishra"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{1,}","KritVardhanMishra"));
        
        
	}
}

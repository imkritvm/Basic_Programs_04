import java.util.regex.*;
public class JavaRegexExamples
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

        System.out.println(Pattern.matches(".*r.*",name1)); // '.' searchs for any one character in string '*' searchs in string
        System.out.println(Pattern.matches(".r..",name1)); // '.' '..' means two characters in string
	System.out.println(Pattern.matches("[a-z]","h")); // '[a-z]' searchs for one character from a-z
	System.out.println(Pattern.matches(".*[a-zA-Z].*","Hg")); // '[a-zA-Z]' searchs for one character from a-z & A-Z
	System.out.println(Pattern.matches("[a-d[m-p]]","n")); // '[a-d[m-p]]' searchs for one character between a-d or m-p
	
	// Another Line Code
	System.out.println(Pattern.matches("[a-z&&[def]]","z")); // '[a-z&&[def]]' searchs for one character between a-z & must be d, or f
	System.out.println(Pattern.matches("[a-z&&[^def]]","z")); // '^' means not
        
        // Regex Quantifiers
        System.out.println(Pattern.matches("[^ri]?","i")); // '^ri' means neither n nor i
        System.out.println(Pattern.matches("[ri]?","i")); // 'ri' must be r or i
        System.out.println(Pattern.matches("[ri]?","ri")); // '?' one character only
        System.out.println(Pattern.matches("[ab]+","abba"));  // '+' one or more than one character
        System.out.println(Pattern.matches("[ab]+","abbas")); // throw false because s is extra
        System.out.println(Pattern.matches("[^ab]*","ababaababab")); // false because '^'
        System.out.println(Pattern.matches("[ab]*","ababasbabab"));  // false because of s
        System.out.println(Pattern.matches(".*K{1}.*",name1)); // {} checks for specefic character on a place
        System.out.println(Pattern.matches("a{1,5}","aaaaaaaa")); // {x,y} start and end numbers are define
        System.out.println(Pattern.matches("a{1,}","aaaaaaaaaaaaaaaaaa")); // {1,} check for infnite as end value is not given
        System.out.println(Pattern.matches("[^a{1,}]","aaaaaaaaaaaaaaaaaa")); // false '^'
        System.out.println(Pattern.matches("a{3,8}","aaaaaaaa")); 
        
        // Regex Metacharacters  {only for 0-9, for printing more than 1 digit add "*"}
        System.out.println(Pattern.matches("\\d","12")); // '\\d' range between 0-9
        System.out.println(Pattern.matches("\\d","1")); // true
        System.out.println(Pattern.matches("\\d*","13414541")); // false '^'
        System.out.println(Pattern.matches("\\D","1")); // fasle, '\\D' checks for character rather than 0-9
        System.out.println(Pattern.matches("\\D","A")); // true
        System.out.println(Pattern.matches(".*","ullu")); // '.*' print true for every character
        System.out.println(Pattern.matches(".","ullu")); // '.' false as '.' checks for only characters that
        System.out.println(Pattern.matches(".","7")); // true
        System.out.println(Pattern.matches(".","80")); // false
        
        // {\s - for whitespace and \S - for non-whitespace character}
        System.out.println(Pattern.matches("\\s","\t")); // '\\s' checks for every single '\' exception
        System.out.println(Pattern.matches("\\s","\t\t")); // false
        System.out.println(Pattern.matches("\\s","a")); // fasle
        System.out.println(Pattern.matches("\\s*","   ")); // true '*'
        System.out.println(Pattern.matches("\\S","a")); // true
        System.out.println(Pattern.matches("\\S","sb")); // false
        System.out.println(Pattern.matches("\\S*","sgab")); // true
        System.out.println(Pattern.matches("\\S"," ")); // false
        
        // {\w - every letter digit and \W (@,!,.,$,%)}
        System.out.println(Pattern.matches("\\w","b")); // true
        System.out.println(Pattern.matches("\\w","9")); // true
        System.out.println(Pattern.matches("\\w","wer")); // false
        System.out.println(Pattern.matches("\\w*","wer")); // true
        System.out.println(Pattern.matches("\\w*","132jkds@")); // false
        System.out.println(Pattern.matches("\\W","@")); // true
        System.out.println(Pattern.matches("\\W*","$@")); // true
        System.out.println(Pattern.matches("\\W","4")); // false
        
        // Alpha numeric Metacharacters
        System.out.println(Pattern.matches("\\w{1,}","Juki")); // true
        System.out.println(Pattern.matches("\\S{1,}","Juki")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{1,}","Krit Vardhan Mishra")); // fasle as there are whitespaces
        System.out.println(Pattern.matches("[a-zA-Z0-9]{1,}","KritVardhanMishra")); // true
        
        
	}
}

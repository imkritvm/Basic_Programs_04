import java.util.*;

public class Pelindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine().toLowerCase(); // Convert input to lowercase
        
        boolean isPalindrome = true;
        int n = A.length();
        for (int i = 0; i < n / 2; i++) {
            if (A.charAt(i) != A.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
        
    }
}




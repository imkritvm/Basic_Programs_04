import java.util.Scanner;

class UsernameValidator {
/*
    public static void UsernameValidator(String username) {

        char firstChar = username.charAt(0);
        
        if(username.length() < 8 || username.length() > 30){
            System.out.println("Invalid");
        } else {
            if(Character.isDigit(firstChar)){
                System.out.println("Invalid");
            } else {
                for(int i = 1; i < username.length(); i++) {
                    char ch = username.charAt(i);

                    if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '_') {
                        System.out.println("Invalid");
                        return;
                    }
                }
                System.out.println("Valid");
            }    
        }
    }*/
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}


public class username {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

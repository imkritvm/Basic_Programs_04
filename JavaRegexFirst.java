import java.util.regex.*;

public class Main {
    public static void main (String[] args){
        String name = "Krit";
        if(name.matches(".*rit.*")){
            System.out.println("Hello");
        }
        else{
            System.out.println("Java");
        }
    }
}

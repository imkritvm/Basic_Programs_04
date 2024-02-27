import java.util.*;
class Main {
    public static boolean isAnagram(String s, String t) {
      if(s.lenght()!=t.length()){
        return false;
      }
      char[] s_array = s.toCharArray();
      char[] t_array = t.toCharArray();

      Arrays.sort(s_array);
      Arrays.sort(t_array);
    
      if (Arrays.equals(s_array, t_array)) {
        return true;
      }
      return false;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    result = isAnagram(s,t);
    System.out.println(result);
  }
}

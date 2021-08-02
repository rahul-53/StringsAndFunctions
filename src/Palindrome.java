import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.next();
        if(isPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("No Palindrome");

    }
    public static boolean isPalindrome(String str){
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if (str.equals(rev))
            return true;
        return false;
    }
}

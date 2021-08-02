import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(characters(str));
    }
    public static int characters(String str){
        int number = str.length();
        return number;
    }

}

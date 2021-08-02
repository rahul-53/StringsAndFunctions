import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        char ch=scanner.next().charAt(0);
        System.out.println(removeChar(str,ch));


    }
    public static String removeChar(String str, char ch){
        char[] charArray = str.toCharArray();
        String str2="";
        for (int i=0;i<charArray.length;i++){
            if (ch!=charArray[i])
                str2+=charArray[i];
        }
        return str2;
    }

}

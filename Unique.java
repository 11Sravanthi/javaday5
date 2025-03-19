import java.util.Scanner;

public class Unique {
    public void uniqueChar(String str) {
        String unique = ""; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                unique += ch; 
            }
        }
        System.out.println("Unique characters: " + unique);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine(); 
        Unique u = new Unique(); 
        u.uniqueChar(str); 
        
    }
}
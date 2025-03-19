import java.util.Scanner;

public class Reverse {
    public void stringReverse(String str) {
        String reversed = ""; 
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i); 
        }
        System.out.println("Reversed string: " + reversed); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string:"); 
        String str = sc.nextLine(); 
        Reverse rev = new Reverse(); 
        rev.stringReverse(str); 
    }
}
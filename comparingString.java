import java.util.Scanner;

public class comparingString {
    public static void stringComparision(String str1,String str2){
        System.out.println("Using equals() : "+str1.equals(str2));
        System.out.println("Using ==: "+(str1==str2));
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter String1: ");
    String str1=sc.next();
    System.out.println("enter String 2: ");
    String str2 = sc.next();
    System.out.println("comparing String1 and String 2:");
    stringComparision(str1, str2);

}
}

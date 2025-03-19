import java.util.Scanner;
public class Squarepowerabsdiff {
    public void mathOperations(double num1,double num2){
        System.out.println("Square root of :"+num1+"is: "+Math.sqrt(num1));
        System.out.println("Square root of :"+num2+"is" +Math.sqrt(num2));
        System.out.println("power of num1 to num2: "+Math.pow(num1, num2));
        System.out.println("power of num2 to num1: "+Math.pow(num2, num1));
        System.out.println("absolute differnece of num1 and num2 is: "+Math.abs(num1-num2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1:");
        double num1=sc.nextDouble();
        System.out.println("enter num2: ");
        double num2=sc.nextDouble();
        Squarepowerabsdiff spad = new Squarepowerabsdiff();
        spad.mathOperations(num1, num2);
 
    }
    
}

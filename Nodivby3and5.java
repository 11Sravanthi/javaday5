import java.util.Scanner;
public class Nodivby3and5 {
    public void divisible3and5(int num1){
        if(num1%5==0 && num1%3==0){
            System.out.println("number is divisible by both 3 and 5");
        }
        else if(num1%5==0){
            System.out.println("number is divisible by 5");
        }
        else if(num1%3==0){
            System.out.println("number is divisible by 3");
        }
        else{
            System.out.println("number is not divisible by any");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number num1:");
        int num1=sc.nextInt();
        Nodivby3and5  ndb = new Nodivby3and5();
        ndb.divisible3and5(num1);

    }

    
    
}




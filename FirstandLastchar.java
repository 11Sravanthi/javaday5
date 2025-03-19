import java.util.Scanner;
public class FirstandLastchar {
    public void firstAndLastChar(String str){
        if(str!= null && !str.isEmpty()){
            char first = str.charAt(0);
            char last  = str.charAt(str.length()-1);
            System.out.println("firstchar: "+first);
            System.out.println("lastchar :"+last);
        } 
        else{
            System.out.println("String is empty");

        }
        
    }
    public  void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("eneter a String:");
        String str = sc.next();
        FirstandLastchar fl = new FirstandLastchar();
        fl.firstAndLastChar(str);
       }
}
    




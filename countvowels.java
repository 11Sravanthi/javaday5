
import java.util.Scanner;
public class countvowels {
    public static int vowelCount(String str){
        int count=0;
        str=str.toLowerCase();
        for(char c:str.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count=count+1;
            }

        }
        return count;
    

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str= sc.next();
        System.out.println("no of Strings in "+str+"is "+vowelCount(str));
        
    }

}

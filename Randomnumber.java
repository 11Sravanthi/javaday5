
import java.util.Random;
public class Randomnumber {
    public void genRandomnumber(){
        Random ran = new Random();
        int randomnum = ran.nextInt(100)+1;

        System.out.println("random number between 1 and 100 is :"+randomnum);
    }
    public static void main(String[] args) {
        Randomnumber rd = new Randomnumber();
        rd.genRandomnumber();
    }
}
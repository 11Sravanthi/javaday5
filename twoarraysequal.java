
import java.util.Arrays;

//check if two arrays are equal 
public class twoarraysequal {
  public static void main(String[] args) {
    int [] array1={1,3,4,5,6};
    int [] array2={1,3,4,5,6};
    int [] array3={5,7,8,9,0};
    System.out.println("is array1 equals to array2: "+Arrays.equals(array1,array2));
    System.out.println("is array1 equls to array3: "+Arrays.equals(array1,array3));
    System.out.println("is array2 and array3 is: "+Arrays.equals(array1,array3));
}  

}

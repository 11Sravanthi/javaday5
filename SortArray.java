// sorting an array
import java.util.Arrays;
public class SortArray {
public static void main(String[] args) {
    int[] array1= {8,4,2,1,35,};
    System.out.println("Before Sorting: "+Arrays.toString(array1));//if we directly print arrays in java it gives the memory address of the array
                                                                // it dosent print the array elements in human readable language like[el1,el2...]
                                                                //Arrays.toString()method is used to print the array in human reable language
    Arrays.sort(array1); // it is a method which is used to sort array in ascending or descending order by defalut it will sort in ascending order
    System.out.println("After sorting: "+Arrays.toString(array1));
}
}

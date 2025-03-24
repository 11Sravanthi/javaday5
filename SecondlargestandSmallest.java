
import java.util.Arrays;
// finding Second largest and smallest element in an array
public class SecondlargestandSmallest {
    public static void main(String[] args) {
        int arr[]={35,47,58,93,20};
        Arrays.sort(arr);
        System.out.println("sorted array is: "+Arrays.toString(arr));//it sorts the array in ascending order
        int secondsmallest = arr[1];//after sorting array in ascending order the index of 1 element will be the second smallest
        int secondlargest = arr[arr.length-2];//arr.length is used to calculate the number of elements in an array arr.length-2is to calculate the index of thesecond largest element
        System.out.println("second smallest element is: "+secondsmallest);
        System.out.println("second largest element is: "+secondlargest);
    }

}

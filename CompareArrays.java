// compare Arrays
import java.util.Arrays;//this imports Array utility class from java.util which provides various helpful methods for working with arrays
public class CompareArrays{
public static void main(String args[]){
    // main method it is the entery point of any java program
    // the main method is public because it is need to be call by the java runtime when you run the program
    // static: we dont need to create the object of the class to call the method the jvm directly invokes the method
    // void : it means the method doesnt return any value
int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {1, 2, 3, 4, 5}; //array1 is identical in content with array2 but they are different arrays with distint memory
int[] array3 = {5, 4, 3, 2, 1}; 
System.out.println("Array 1 equals Array2: "+Arrays.equals(array1,array2));//Array.equals methods checks if both arrays are equal in size 
System.out.println("Array 1 equals Array2: "+Arrays.equals(array2,array3));// and have same elements order then returns true otherwise false
System.out.println("Array 1 equals Array2: "+Arrays.equals(array1,array3));//both array 1 and 2 are same in size and elements it returns true and remaning it returns false

}
}

import java.util.Arrays;

public class copyelements {
    public static void main(String[] args) {
        int originalarray[]={1,20,3,4,5,6};
        int copiedarray[]=new int [originalarray.length];//copiedarray defines a new array of integers
                                                         // new keyword is used to allocate memory for the array
        System.out.println("originalarray is: "+Arrays.toString(originalarray));                                                //  originalarray.length gives the length of array copied array will have same sise as original array
        //using syste,arraycopy() method it is a built in method
        System.arraycopy(originalarray,0,copiedarray,0,originalarray.length);
        // originalarray:it is a source array from which elements are being copied
        // 0:it is the starting index in the originalarray where cpoy begins
        // copiedarray:it is the destination array where elements from orginalarray are copied
        //i0:it is the starting index of the copied array where the elements from originalarray will be placed
        System.out.println("copiedarray is: "+Arrays.toString(copiedarray));
        // using Arrays.copyOf
        int copiedarray2[]=Arrays.copyOf(originalarray,originalarray.length);
        /* originalarray:this is the souce array from which elements are copied
        originalarray.length :thi specifies the length of the new array
        the length of originalarray is passed as the second argument*/
        System.out.println("copiedarray2 is: "+Arrays.toString(copiedarray2));
         
    }

}

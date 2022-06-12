import java.util.*;

//this arrays class parform the operation on normal array
public class ArraysClass 
{
    public static void main(String[] args)
    {
        // int[] ary ={1,2,3,4,5,6,7,8,9};
        // //ony work on sorted array
        // int index = Arrays.binarySearch(ary, 3);
        // //return the elment index
        // System.out.println(index);

        Integer[] oary={10,39,17,40,68,35,56,29};
        System.out.println(oary);
        Arrays.sort(oary);
        System.out.println(oary);
    }    
}

//https://www.geeksforgeeks.org/java-program-for-program-to-find-largest-element-in-an-array/

import java.util.Arrays;
public class LargestelementinanArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 62, 7227, 98, 1000, 2831, 10987};
        System.out.println("The largest element in the given array is " + largestnum(arr));
    }
    //The basic iterative approach using for loop
//    public static int largestnum(int arr[]){
//        int largestnum = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            if(largestnum < arr[i]){
//                largestnum = arr[i];
//            }
//        } return largestnum;
//    }

    // Second method using java 8 stream api
    public static int largestnum(int arr[]){
        int largestnum = Arrays.stream(arr).max().getAsInt();
        return largestnum;
    }
}





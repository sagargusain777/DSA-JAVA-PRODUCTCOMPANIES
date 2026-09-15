import java.util.*;
public class MaximumElementArray{

    public static void main(String [] args){

        int[] arr = {10, 5, 8, 20, 15, 20, 3};

        int maximumElementArray = Integer.MIN_VALUE;

        for( int i = 0; i < arr.length ; i++){
            if(arr[i] > maximumElementArray){
                maximumElementArray = arr[i];
            }
        }
        System.out.println("The maximum element in the Array is " + maximumElementArray);

    }

}
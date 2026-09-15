public class TargetAppearinArray{

    public static void main(String [] args){
        int [] arr = {4, 7, 2, 7, 9, 7, 1};
        int target = 7 ;
        int result = countOccurrences(arr,target);
        System.out.println("The occurrence of target element is " + result);

    }

    static int countOccurrences(int[] arr, int target){

        int counter = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]== target){
                 counter++;

            }
        }

        return counter;

    }
}
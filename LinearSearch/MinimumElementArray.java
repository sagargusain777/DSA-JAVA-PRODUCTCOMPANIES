public class MinimumElementArray{
    public static void main(String [] args){
        int[] arr = {10, 5, 8, 20, 15, 20, 3};
        int minimumElement = Integer.MAX_VALUE;

        for ( int i = 0 ; i < arr.length ; i++){
            if(arr[i] < minimumElement){
                minimumElement = arr[i];
            }
        }


        System.out.println("The minimum Element in the Array : " + minimumElement);
    
    }
}
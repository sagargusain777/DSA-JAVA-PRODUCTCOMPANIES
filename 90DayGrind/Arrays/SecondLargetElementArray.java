public class SecondLargetElementArray {
    
    public static void main(String [] args){

        int [] arr = {1,7,7,7,8,8,10 ,9};
        
        int result = findSecondLargest(arr);
        System.out.println("The Second Largest Element in Array is :" + result);
    }

    public static int findSecondLargest(int []arr){

        int largest =  arr[0];
        int slargest = Integer.MIN_VALUE;
        // Edge Case : There is possibility that second largest Element can be there  once we get it like there can be second largest

        for(int i = 0 ; i<arr.length ;i++){

            if(arr[i]> largest){
                slargest = largest;
                largest = arr[i];
            }
            
            else if(arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }

        return slargest;

        
    }
}

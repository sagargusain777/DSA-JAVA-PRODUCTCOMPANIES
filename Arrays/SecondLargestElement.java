public class SecondLargestElement{

    public static void main(String [] args){
        
        int [] arr = {1,2,4,4,7,7,5};

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for (int i = 0 ; i < arr.length ; i++){

            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }

            else if(arr[i] > slargest &&  arr[i] < largest){
                slargest = arr[i];
            }
        }

        System.out.println("The second largest Element in " + slargest); 
    }
}
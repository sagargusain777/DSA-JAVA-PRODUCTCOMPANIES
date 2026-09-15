public class LinearSeach {

    public static void main(String [] args){

        int [] arr = {1,3,5,10,17,19};
        int target = 10 ;

        int result = linearSearch(arr,target);

        System.out.println("The target element in the array is at index :" + result);


    }

    public static int linearSearch(int [] arr , int target){

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i]== target){
                return i;
                
            }
        }

        return -1;
    }
    
}

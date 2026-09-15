public class CheckifArrayisSorted {

    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,10,9};

        boolean result = checkIfArrayisSorted(arr);

        System.out.println("Is Array is Sorted :" + result);

    }

    public static boolean checkIfArrayisSorted(int [] arr){

        for(int i = 1 ; i<arr.length;i++){

            if(arr[i] < arr[i-1]){
                return false;
            }
        }

        return true;

    }
    
}

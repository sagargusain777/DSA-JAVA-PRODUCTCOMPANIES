
public class SmallestElementinArray {
    
    public static void main(String [] args){

        int [] arr = {1,20,40,5,10,3};

        int result = findSmallestElement(arr);

        System.out.println("The smallest Element in Array is :" + result);


    }

    private static int findSmallestElement(int [] array){

        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ; i < array.length ; i++){

            if(array[i]< smallest){
                smallest = array[i];
            }
        }

        return smallest;
    }
}

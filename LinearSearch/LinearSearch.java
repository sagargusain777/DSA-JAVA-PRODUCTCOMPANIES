public class LinearSearch{

    public static void main (String [] args){
        int [] numbers = {1,3,4,5,17,20,19};
        int target = 17;

        int answer = searching(numbers,target);
        System.out.println("The index of given target is " + answer);
    }

    public static int searching(int [] numbers , int target){

        int index = -1;
        
        for ( int i = 0 ; i < numbers.length ; i++){
            if(numbers[i]==target){

                index = i;
                break;

            }
        }

        return index;
    }
}
public class SecondSmallestElement{

    public static void main (String [] args){

        int [] arr = { 8 , 9 , 7 ,2, 4, 4,10};

        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i]< smallest){

                ssmallest = smallest;
                smallest = arr[i];


            }
            else if ( arr[i]< ssmallest  && arr[i] > smallest){
                ssmallest = arr[i];
            }

                
            }
            System.out.println("The Second Smallest Element in Array is : " + ssmallest);
        }

        
 }

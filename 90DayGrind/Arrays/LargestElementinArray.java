
public class LargestElementinArray {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 10, 72, 36, 13, 14 };

        int result = findLargestElement(arr);

        System.out.println("The largest Element in the Array is :" + result);

    }

    private static int findLargestElement(int[] arr) {

        int largestElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }

        return largestElement;
    }

}

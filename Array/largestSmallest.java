import java.util.Arrays;

public class largestSmallest {

    public static int largest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    
   
    

    public static void main(String[] args) {
        int[] arr = {21,4,17,8,29,65};
        System.out.println("Largest number : " + largest(arr));
        System.out.println("Smallest number : " + smallest(arr));
        System.out.println();

        // or we can just sort the array and print first an last element.
        Arrays.sort(arr);
        System.out.println("smallest number : " + arr[0]);
        System.out.println("largest number : " + arr[arr.length-1]);
    }
}

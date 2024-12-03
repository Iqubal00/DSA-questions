public class arrayReverse {

    public static int[] reverse(int[] arr){
        int n = arr.length;
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
            n--;
        }

        return arr;
    }
    
    
    public static void main(String[] args){
        int[] arr = {23,45,67,89,102,76};
        int[] result = reverse(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }

    }
}


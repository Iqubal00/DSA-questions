public class binarySearch {
    public static boolean isFound(int[] arr, int key){
        int lower=0, upper=(arr.length-1),mid=0;
        

        while(lower<=upper){
            mid=(lower+upper)/2;
            if(key>arr[mid])
            lower=mid+1;
            else if(key<arr[mid])
            upper=mid-1;
            else{
            return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {23,45,67,89,102};
        int key = 45;

        if(isFound(arr, key)){
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }
    }
}

public class linearSearch {

    public static boolean isFound(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if (arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {4,7,12,45,23,8,56};
        int key = 3;

        if(isFound(arr, key)){
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }
    }
}
import java.util.*;

public class deleteElement {

    public static int[] deleteitem(int a[], int item){
        int a_new[] = new int [a.length-1];
        int i,k;

        for( i=0, k=0; i<a.length; i++){
            if(a[i]!=item){
                a_new[k]=a[i];
                k++;
            }
        }
        return a_new;
    }

    public static void main(String[] args) {
        int a[]= {34,67,89,98,57};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to delete : ");
        int item = sc.nextInt();

        int a_new[]=deleteitem(a, item);
        
        System.out.println("Array elements : ");
        for( int i=0; i<a_new.length; i++){
            System.out.print(a_new[i]+ " ");
        }
    }
}
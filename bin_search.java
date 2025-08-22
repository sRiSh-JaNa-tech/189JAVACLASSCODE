import java.util.Arrays;
import java.util.Scanner;
public class bin_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i = 0;i < n;i++){
            System.out.print("Enter the number : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        int low = 0;
        int high = n-1;
        boolean found = false;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key){
                found = true;
                break;
            }
            else if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if (found) {
            System.out.println("True - Key found in the array.");
        } else {
            System.out.println("False - Key not found.");
        }
        sc.close();
    }
}

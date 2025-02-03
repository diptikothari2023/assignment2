import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        Integer[] arr = new Integer[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Convert array to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList: " + arrayList);
        
        // Convert ArrayList back to array
        Integer[] newArray = arrayList.toArray(new Integer[0]);
        System.out.println("Converted back to Array: " + Arrays.toString(newArray));
        
        scanner.close();
    }
}

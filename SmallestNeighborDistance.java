import java.util.Scanner;

public class SmallestNeighborDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int index = findSmallestNeighborIndex(arr);
        System.out.println("Index of the first number in the closest pair: " + index);
        
        scanner.close();
    }
    
    public static int findSmallestNeighborIndex(int[] arr) {
        int minIndex = 0;
        int minDiff = Math.abs(arr[1] - arr[0]);
        
        for (int i = 1; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        
        return minIndex;
    }
}

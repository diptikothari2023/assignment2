import java.util.Scanner;
import java.util.ArrayList;

public class EvenOddArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        
        scanner.close();
    }
}

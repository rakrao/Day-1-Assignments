
//program about bubble sort
import java.util.Scanner;

public class bubble {
	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[15], i = 0, j; // declaring array
		System.out.println("Array");
		int n = arr.length;
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) // for loop
			{
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1]; // logic
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array:"); // printing sorted array
		for (i = 0; i < n; i++)
			System.out.println(arr[i]);
	}
}
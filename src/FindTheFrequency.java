import java.util.*;
public class FindTheFrequency {

	public static void main(String[] args) {
		
		int[] arr = {5, 12, 3, 7, 12, 1, 6, 3, 3};
        int[] freq = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            freq[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = -1; // Mark as visited
                }
            }
        }

        System.out.println("Element | Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (arr[i] != -1) {
                System.out.println("   " + arr[i] + "    |    " + freq[i]);
            }
        }
    }
}



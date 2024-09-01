
public class DuplicateElementsOfAnArray {

	public static void main(String[] args) {
		int[] arr = {5, 12, 3, 7, 12, 1, 6, 3, 3};
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != -1) {
                    System.out.println(arr[i]);
                    arr[j] = -1; // Mark as visited
                }
            }
        }

	}

}

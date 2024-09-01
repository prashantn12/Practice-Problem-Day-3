
public class SortTheElements {

	public static void main(String[] args) {
		int[] arr = {5, 12, 3, 7, 8, 1, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array sorted in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

	}

}

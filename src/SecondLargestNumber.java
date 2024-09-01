
public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr = {5, 12, 3, 7, 8, 1, 6};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Second largest element: " + max2);

	}

}

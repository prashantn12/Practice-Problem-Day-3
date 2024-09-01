
public class PrintSmallestElement {

	public static void main(String[] args) {
		   int[] arr = {5, 12, 3, 7, 8, 1, 6};
	        int min = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        System.out.println("Smallest element: " + min);

	}

}

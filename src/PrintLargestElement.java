
public class PrintLargestElement {

	public static void main(String[] args) {
		  int[] arr = {5, 12, 3, 7, 8, 1, 6};
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Largest element: " + max);
	    }

	}




public class PrinttheElementsofanArrayPresentonEvenPositions {

	public static void main(String[] args) {
		 int[] arr = {5, 12, 3, 7, 8, 1, 6};
	        System.out.println("Elements on even positions:");
	        for (int i = 1; i < arr.length; i += 2) {
	            System.out.println(arr[i]);
	        }

	}

}

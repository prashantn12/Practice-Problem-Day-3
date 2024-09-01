
public class ElementsOnOddPositions {

	public static void main(String[] args) {
		int[] arr = {5, 12, 3, 7, 8, 1, 6};
        System.out.println("Elements on odd positions:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i]+" ");
        }

	}

}

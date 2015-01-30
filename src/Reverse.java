public class Reverse {

	public static void reverse(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		int[] test = new int[] { 1, 2, 3 };
		reverse(test);
		System.out.print("{");
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i]);
			if (i < test.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

}

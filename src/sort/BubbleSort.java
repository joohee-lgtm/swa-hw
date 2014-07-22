package sort;

public class BubbleSort implements ISort {
	public BubbleSort() {
	}

	public int[] sort(int[] array) {
		int len = array.length;
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < len - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}

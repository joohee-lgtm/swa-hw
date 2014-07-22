package sort;

public class QuickSort implements ISort{
	public QuickSort(){
		
	}
	
	public int[] sort(int[] array) {
		System.out.println("start");
		quicksort(0, array.length - 1, array);
		return array;
	}

	private int[] quicksort(int low, int high, int[] array) {
		int i = low, j = high;
		int pivot = array[low + (high - low) / 2];
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quicksort(low, j, array);
		if (i < high)
			quicksort(i, high, array);
		return array;
	}
}
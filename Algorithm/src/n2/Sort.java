package n2;

public class Sort {
	public static int[] SelectionSortAsc(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIdx = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIdx]) {
					minIdx = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[minIdx];
			array[minIdx] = temp;
		}
		
		return array;
	}
	
	public static int[] BubbleSortAsc(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}				
		}
		
		return array;
	}
}

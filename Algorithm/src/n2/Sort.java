package n2;

public class Sort {
	
	public static int[] selectionSort(int[] array) {
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
	
	public static int[] bubbleSort(int[] array) {
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
	
	
	public static int[] insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int val = array[i];
			
			for (int j = i; j > 0; j--) {
				if (array[j - 1] > val) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else {					
					array[j - 1] = val;
					break;
				}
			}
		}
		
		return array;
	}
	
}

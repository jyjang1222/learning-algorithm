package n2;

public class Sort {
	public static int[] SelectionSortDesc(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int max = array[i];
			int maxIdx = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > max) {
					max = array[j];
					maxIdx = j;
				}
			}
			
			int temp = array[i];
			array[i] = max;
			array[maxIdx] = temp;
		}
		
		return array;
	}
}

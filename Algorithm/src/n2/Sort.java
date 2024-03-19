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
			int val = array[i]; // 데이터 선택
			int idx = i; // 삽입할 위치
			
			for (int j = i; j > 0; j--) { // 삽입할 위치 찾기
				if (array[j - 1] > val) { // array[j - 1]가 크면 뒤로 한칸 이동
					array[j] = array[j - 1];
					idx = j - 1;
				} else {
					break;
				}
			}
			array[idx] = val;
		}
		return array;
	}
	
	public static int[] shellSort(int[] array) {
		int gap = array.length / 2;
		
		while(gap >= 1) { // gap이 1이 될때까지 반복
			for (int i = 0; i < gap; i++) { // 부분배열 갯수 만큼 반복
				// 아래는 삽입정렬
				for (int j = i + gap; j < array.length; j += gap) {
					int val = array[j]; // 데이터 선택
					int idx = j; // 삽입할 위치
					
					for (int k = j; k > i; k -= gap) { // 삽입할 위치 찾기
						if (array[k - gap] > val) { // array[j - 1]가 크면 뒤로 한칸 이동
							array[k] = array[k - gap];
							idx = k - gap;
						} else {
							break;
						}
					}
					array[idx] = val;
				}
			}
	
			gap /= 2;
		}
		return array;
	}
	
}

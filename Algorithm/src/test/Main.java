package test;

import java.util.Arrays;
import n2.Sort;

public class Main {
	
	public static void main(String[] args) {
		
		int[] numList = {345,67,4,56,761,35,1233,0,-1,35,-32,4};
//		numList = Sort.selectionSort(numList);
//		numList = Sort.bubbleSort(numList);
		numList = Sort.insertSort(numList);
		
		System.out.println(Arrays.toString(numList));
	}

}

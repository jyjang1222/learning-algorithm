package test;

public class Test {
	public static int solution(int x, int num) {
		int subtractResult = x - num;
		
		if (subtractResult > 0) {
			return solution(subtractResult, num);		
		} else if (subtractResult == 0) {
			return subtractResult;
		}
		return x;
	}
}

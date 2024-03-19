# 정렬 알고리즘
## 선택 정렬
### 내림차순 정렬
```java
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
```
- 입력 배열에서 가장 큰 또 작은 값부터 순서대로 **선택**해서 나열하는 방식

# 기타
## 유클리드 호제법
### 최대공약수 구하기
```java
public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
```
1. 두 개의 자연수를 선택합니다. 이를 편의상 큰 수를 A, 작은 수를 B라고 합니다.
2. B가 0이 될 때까지 A를 B로 나눈 나머지를 구합니다.
3. A를 B로, B를 나머지로 바꿉니다.
4. B가 0이 되면, 그 때의 A가 최대공약수(Greatest Common Divisor, GCD)가 됩니다.

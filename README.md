# 정렬 알고리즘
## 선택 정렬
```java
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
```
- 입력 배열에서 가장 큰 또 작은 값부터 순서대로 **선택**해서 나열하는 방식이다

## 버블 정렬
```java
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
```
- 모든 인접한 두 데이터를 차례대로 비교해서 자리를 바꾸는 과정을 반복해서 정렬을 수행한다
- 구현이 간단하다

## 삽입 정렬
```java
public static int[] insertSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
        int val = array[i];
        int idx = i;
        
        for (int j = i; j > 0; j--) {
            if (array[j - 1] > val) {
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
```
- 미정렬된 데이터에서 데이터를 하나 뽑은 후 정렬된 데이터에 바른 위치에 삽입해서 나열하는 방식이다
- 첫번째 데이터를 이미 정렬된 것으로 간주한다.

## 쉘 정렬
```java
public static int[] shellSort(int[] array) {
    int gap = array.length / 2;
    
    while(gap >= 1) { // gap이 1이 될때까지 반복 (부분배열 1개가 될때까지)
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
```
- 삽입 정렬의 단점을 보완한 것으로 부분배열의 크기와 갯수를 변화시키면서 삽입 정렬을 수행한다.

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

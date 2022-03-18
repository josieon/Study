## 정렬

### 목차
1. [Selection Sort](#selection-sort)
2. [Bubble Sort](#bubble-sort)
3. [Insertion Sort](#insertion-sort)
4. [Merge Sort](#merge-sort)
5. [Heap Sort](#heap-sort)
6. [Quick Sort](#quick-sort)
7. [Tim Sort](#tim-sort)
8. [Counting Sort](#counting-sort)  

### Selection Sort
- Time Comlexity : O(N^2)
- Space Complexity : O(N)

![Selection_sort](./img/Selection_sort.gif)

1. 인덱스의 가장 앞에서부터, 그 이후의 배열값 중 가장 작은 값을 찾는다.
2. 가장 작은 값을 찾으면, 그 값을 현재 인덱스의 값과 바꿔준다.
3. 다음 인덱스에서 위 과정을 반복해준다.

### Bubble Sort
- Time Complexity : O(N^2)  
- Space Complexity : O(N)

![Bubble_sort](./img/Bubble_sort.jpg)

1. 삽입 정렬은 두 번째 인덱스부터 시작한다. 현재 인덱스 값과, 바로 이전의 인덱스 값을 비교한다.
2. 만약 이전 인덱스 값이 더 크면, 현재 인덱스의 값과 바꿔준다.
3. 현재 인덱스가 더 크면, 교환하지 않고 다음 두 연속된 배열값을 비교한다.
4. 이를 (전체 배열의 크기 - 현재까지 순환한 바퀴 수)만큼 반복한다

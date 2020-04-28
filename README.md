# Sort Algorithm

## 1. Bubble Sort 
    인접한 두 원소를 비교하여 자리를 교환하는 방식

##### 1) 주어진 배열
<img src = "./img/b_1.png" width="20%">

##### 2) array[0]과 array[1] 비교

<img src = "./img/b_2.png" width="20%">

##### 3) 13이 5보다 크므로 교체
<img src = "./img/b_3.png" width="20%">

##### 4) array[1]과 array[2] 비교
<img src = "./img/b_4.png" width="20%">

##### 5) 8이 13보다 작으므로 교체
<img src = "./img/b_5.png" width="20%">

##### 6) 2) ~ 3) 과정을 반복한 결과
<img src = "./img/b_6.png" width="20%">


## 2. Merge Sort
     divide & conquer 을 이용하여 정렬하는 방식
### Divide & Conquer
    Divide : 큰 문제를 풀기 쉽게 하기 위해 작은 문제로 나누는 단계
    Conquer : 작은 문제를 해결하여 해를 구하는 단계, 보통 재귀적으로 구함
    Merge :  작은 문제들의 해를 합치는 단계 

## 3. Quick Sort
    데이터를 두 부분으로 분할하고 분할한 데이터 내에서 정렬을 함. 각 분할된 부분을 재귀적으로 정렬.

## 4. Heap Sort
    자료구조 Heap을 이용하여 데이터를 정렬함.

### Heap
    완전 이진트리(Complete Binary Tree)로서 성질을 만족함
    최소힙 : 모든 부모 노드의 값이 자식 노드보다 작은 힙
    최대힙 : 모든 부모 노드의 값이 자식노드보다 큰 힙


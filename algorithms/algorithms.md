# ALGORITHMS
Here I’ll save what I learn about algorithms.

_An algorithm is a set of instructions that transforms input into output._
___

## The big O notation
Big O notation is used to classify algorithms according to how their time or space complexity grows as the input size increases.
* Time complexity = Refers to how the running time of an algorithm grows as the input size increases.
* Space complexity = Is the amount of memory an algorithm uses as the input size grows.
### Complexity types
* **Constant - O(1)**: Regardless of the input size, the algorithm’s execution time remains constant, the same. Like acess a first element of a list.
* **Logarithm - O(log n)**: This type of growth occurs when the problem size is reduced by half at each step, resulting in logarithmic time complexity.
* **Linear - O(n)**: The runtime grows proportionally to the number of items. If there are 10 items, it takes 10 steps; if there are 100 items, it takes 100 steps.
* **linearithmic - O(n log n)**: It is the gold standard for efficient sorting algorithms. It is slightly slower than linear time, but still very efficient.
* **Quadratic - O(n²)**: In quadratic time, the number of operations grows proportionally to n².
  If there are 10 items, it may take about 100 steps; if there are 100 items, it may take about 10,000 steps.
* **Exponential - O(2^n)**: Each time a new element is added to the set, the runtime doubles.
Ex: n = 1 -> 2 steps; n = 2 -> 4 steps; n = 3 -> 8 steps...
* **Factorial O(n!)**: The runtime grows factorially with the input size.
Ex: n = 3 -> 6 steps; n = 4 -> 24 steps; n = 5 -> 120 steps...
---

# Searching algorithms
 * ### Linear search algorithm - Complexity O(n)
 The linear search algorithm is a search algorithm that finds a specific value in a list checking each element one by one.
 An example is:
 ```
    int[] array = {2, 5, 0, 8, 4, 5, 1};
    int number = 1;
    for (int i = 0 ; i < array.length; i++){
        if (array[i] == number){
            System.out.printf("Found after %d loops!", i+1);
        }
    }
   ```

* ### Binary search algorithm - complexity O(log n)
Because it has a time complexity of O(log n), the binary search algorithm is highly efficient. For it to work, the list must be sorted. The algorithm works by repeatedly dividing the search range in half. Three indexes are used: start, middle, and end. The middle element is compared with the target value. If the target value is greater than the middle element, the search continues only in the right half of the list; if it is smaller, the search continues only in the left half. This process repeats until the element is found or until there is no search range left.

```
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int myNum = 3;
    int low = 0;
    int high = array.length - 1;

    while(high >= low){
        int middle = (low + high)/2;
        if(array[middle] == myNum){
            System.out.printf("Found number %d, at index %d.", myNum, middle);
            break;
        } else if(array[middle] < myNum){
            low = middle + 1;
        } else {
            high = middle - 1;
        }
    }
    if(low > high){
        System.out.println("Number not found!");
    }
```
    
# Sorting algorithms
   * ### Bubble sort - Complexity O(n²)
Bubble Sort repeatedly scans the list, compares adjacent elements, and swaps them when needed, so that larger values gradually move to the end.
Example:
```
    int[] array = {5, 2, 9, 1, 4, 6, 0, 7};
    for (int i = 0; i < array.length; i++) {
        boolean control = true;
        for (int j = 0; j < array.length - 1 - i; j++) {
            if (array[j] > array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
            control = false;
            }
        }
        if (control) {
        break;
        }
    }
    System.out.println(Arrays.toString(array));
```

* ### Selection sort - Complexity O(n²)
Selection Sort repeatedly selects the smallest element from the unsorted part of the list and swaps it with the current position.
```
    int[] array = {7, 2, 5, 3, 1, 0};

    for(int i = 0; i < array.length; i++){
        int minNumberIndex = i;

            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[minNumberIndex]){
                    minNumberIndex = j;
                }
            }

        int tempNumber = array[i];
        array[i] = array[minNumberIndex];
        array[minNumberIndex] = tempNumber;
        }
        System.out.println(Arrays.toString(array));
```

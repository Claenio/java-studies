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
   * ### Bubble sort - Complexity O(n²)

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
```

```

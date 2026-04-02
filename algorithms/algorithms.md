# ALGORITHMS
Here I’ll save what I learn about algorithms.

_An algorithm is a set of instructions that transforms input into output._
___

## The big O notation
Big O notation is used to classify algorithms according to how their time or space complexity grows as the input size increases.
* Time complexity = Refers to how the running time of an algorithm grows as the input size increases.
* Space complexity = Is the amount of memory an algorithm uses as the input size grows.
### Complexity types
* **Constant - O(1)**: Regardless of the input size, the algorithm’s execution time remains constant, the same. Like Acess a first element of a list.
* **Logarithm - O(log n)**: 

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

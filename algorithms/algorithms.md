# ALGORITHMS
Here I’ll save what I learn about algorithms.

_An algorithm is a set of instructions that transforms input into output._

 * ### Linear search algorithm
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

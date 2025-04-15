#include <iostream>
#include <stdio.h>
//using namespace std;

int main()
{
    int* ptr, sum = 0;

    // Declare malloc() function
    ptr = (int*) malloc(10 * sizeof(int));

    // Checking if pointer ptr got initialized or not.
    if(ptr == NULL) {
        printf("Memory Allocation Fails.\n");
        exit(0);
    }
    else {
        printf("Memory Allocated.\n");

        // Putting Values
        for (int i=0; i<5; i++) {
            ptr[i] = i;
            sum += ptr[i];          // getting sum fsr
        }

        // Printing Values
        for (int i=0; i<5; i++) {
            printf("%d \n", ptr[i]);  // here %d is just converting Binary coming from memory to Decimal.
        }
        printf("SUM: %d", sum);
    }


    return 0;
}

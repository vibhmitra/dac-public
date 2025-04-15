#include <iostream>
#include <stdio.h>
//using namespace std;

int main()
{
    int* ptr, n, sum = 0;

    printf("HOW MANY? > ");
    scanf("%d", &n);

    ptr = (int*) malloc(n * sizeof(int));

    if(ptr == NULL) {
        printf("Memory Allocation Fails.\n");
        exit(0);
    }
    else {
        printf("Memory Allocated.\n");

        // Putting Values
        for (int i=0; i<n; i++) {
            scanf("%d", ptr + i);
            sum += *(ptr + i);          // getting sum fsr
        }

        // Printing Values
        for (int i=0; i<n; i++) {
            printf("%d \n", ptr[i]);  // here %d is just converting Binary coming from memory to Decimal.
        }
        printf("SUM: %d", sum);
    }

    free(ptr);  // Freeing Up The MEMORY

    return 0;
}

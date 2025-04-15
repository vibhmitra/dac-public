#include <iostream>
#include <stdio.h>
//using namespace std;

int main()
{
    int* ptr, n, n2, sum = 0;

    printf("HOW MANY ELEMENTS? > ");
    scanf("%d", &n);

    ptr = (int*) calloc(n, sizeof(int));    // calloc() function

    if(ptr == NULL) {
        printf("Memory Allocation Fails.\n");
        exit(0);
    }
    else {
        printf("Memory Allocated.\n");


        for (int i=0; i<n; i++) {
            printf("%p \n", ptr + i);

        }
    }

    printf("NEW SIZE > ");
    scanf("&d", &n2);

    ptr = (int*) realloc(ptr, n2 * sizeof(int));

    for (int i=0; i<n2; i++) {
        printf("%p \n", ptr + i);

    }

    free(ptr);


    return 0;
}

#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, i, temp;
    scanf("%d", &n);
    int *arr = (int*)malloc(n * sizeof(int));

    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    for(i = 0; i < n / 2; i++) {
        temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
    }
    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    free(arr);
    
    return 0;
}

#include <stdio.h>

int main(){
    int arr[3][3] = {1,2,3,4,5,6,7,8,9};

    printf("arr 배열의 2행 3의 수 : %d \n",arr[1][2]);//2행-1,3-1
    printf("arr 배열의 1행 2열의 수 : %d \n", arr[0][1]);

    return 0;

}
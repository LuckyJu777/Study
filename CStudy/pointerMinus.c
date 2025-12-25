#include <stdio.h>
int main(){
    int a;
    int* pa = &a;
    int* pb;

    *pa = 3;
    pb = pa;

    printf("pa가 찍는 : %d \n", *pa);
    printf("pb가 찍는 : %d \n", *pb);

    return 0;
}
#include<stdio.h>
int main(){
    //연산자로 3[arr] > *(3+arr) 로바꿔준다
    //arr[3] 과 동일한 결과를 출력
    int arr[5] = {1,2,3,4,5};

    printf("a[3] : %d \n", arr[3]);
    printf("*(a+3) : %d \n", *(arr+3));
    return 0;
}
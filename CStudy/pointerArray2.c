#include<stdio.h>
int main(){
    int arr[10] = {
        1,2,3,4,5,6,7,8,9,10
    };
    int* parr;

    parr = &arr[0];

    printf("arr[3] = %d, *(parr+3)=%d \n",arr[3],*(parr+3));
    //parr+3=arr[3]의 주소값, + *부호를 붙여주면 *의 연산자역할이 
    //그 주소값에 해당하는 데이터를 의미해라 라는 뜻 = *(parr+3) = arr[3]과 동일
    return 0;

}
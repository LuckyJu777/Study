#include <stdio.h>

int main(){

    const int a = 3;
    int b= 4;

    const int c=b;  //상수의 특성상 변수를 상수 값으로 지정 할 수 없다.
    a + a +3;   //상수는 특성상 그 값을 변화시킬 수 없다.
    printf("%d",a);

    return 0;
}
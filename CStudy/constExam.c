#include <stdio.h>
//상수포인터
int main(){
    int a;
    int b;
    const int *pa = &a;

    //*pa = 3;

    pa = &b;

    return 0;
}
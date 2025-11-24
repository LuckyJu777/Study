#include <stdio.h>
int main(){
    int a ;
    a = 127;
    printf("a 값 %d 진수로 : %d \n", 10,a); //%d 10진수
    printf("a 값 %d 진수로 : %o \n", 8,a); //%o 8진수출력
    printf("a 값 %d 진수로 : %x \n", 16,a); //%x 16진수출력

    float b = 3.141592f; //f를 붙이는 이유 : doble로 인식할수 있음
    double c = 3.141592;
    printf("b : %f \n", b);
    printf("c : %f \n", c);

    printf("%f",1);
    printf("%f",1.0); //%f를 쓸때는 꼭 소숫점을 표기 
    return 0;
}
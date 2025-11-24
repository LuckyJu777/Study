#include<stdio.h>
int main(){
    float a = 3.141592f;
    double b = 3.141592;
    int c = 123;

    printf("a : %.2f \n",a);    //소숫점 2째이하 만 표시
    printf("b : %6.3f \n",b);   //6개의 칸 소숫점 3자리 만 표시
    printf("c : %5d \n",c);     //5자리를 표시
    printf("c : %2d \n",c);     //2자리를 표시하지만 자릿수가 더 많다면 다 표시
}
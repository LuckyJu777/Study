#include<stdio.h>
int main(){
    int a,b;
    //double b;
    float c,d;

    printf("두 숫자 입력 : ");
    scanf("%d %d", &a, &b);

    c = a / b;
    d = (float)a / b;

    //b = 2.4;
    //a = (int)b;

    printf("두 수의 비율 :  %f, %f", c, d);

    return 0;

}
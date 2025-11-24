#include<stdio.h>
int main(){
    int i;
    float f;
    printf("실수 입력 > ");
    scanf("%f", &f);
    i = (int)(f*100)%100;
    printf("i=%d\n",i);

}
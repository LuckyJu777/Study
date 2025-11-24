#include<stdio.h>
int main() {
    double celsius; //섭씨

    printf("섭씨온도를 화씨온도로 \n");
    printf("섭씨온도 : ");
    scanf("%lf", &celsius);

    printf("섭씨 %f 도는 화씨로 %f 도 입니다. \n",celsius,9*celsius / 5+32);
    
    return 0;
}
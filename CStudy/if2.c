#include<stdio.h>
int main(){
    double i,j;
    printf("나누고 싶은 두 정수 입력 : ");
    scanf("%lf %lf", &i, &j);

    if(j == 0){
        printf("0 으로 나눌 수 없다. \n");
        return 0 ;
    }

    printf("%f 를 %f 로 나눈결과 : %f \n",i,j,i/j);
    return 0;
}
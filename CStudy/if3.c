#include<stdio.h>
int main(){
    int a;
    printf("아무숫자나 입력 : ");
    scanf("%d", &a);

    if(a >= 10){
        if(a <20){
            printf("%d는 10이상 20미만의 수. \n",a);
        }
    }
    return 0;
}
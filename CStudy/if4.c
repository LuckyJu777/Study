#include<stdio.h>
int main(){
    int height, weight;
    printf("키 몸무게 각각 입력 : ");
    scanf("%d %d", &height, &weight);

    if(height >= 190 || weight >= 100){
        printf("거구'입니다. \n");
    }

    return 0;
}
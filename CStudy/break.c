#include<stdio.h>
int main(){
    int usranswer;

    printf("컴퓨터가 생각한 숫자를 맞춰보세요! \n");

    for(int i =0; i<9; i++){
        scanf("%d", &usranswer);
        if(usranswer == 3){
            printf(" TRUE! \n");
            break;
        }else{
            printf("FALSE! \n");
            
        }
    }
    return 0;
}
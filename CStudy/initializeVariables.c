#include <stdio.h>

int main(){
    int arr1[3] = {1,0,0};
    int arr2[5] = {1,2,3};

    for(int i=0; i<3; i++){
        printf("arr 1 [%d]: %d \n",i,arr1[i]);

    }

    for(int i=0; i<5; i++){
        printf("arr 2 [%d]: %d \n",i,arr2[i]);
    }
    
    return 0;
}
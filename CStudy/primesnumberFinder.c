#include <stdio.h>
int main(){ //소수 1000개만 찾는다

    int guess = 5;  //소수의 배열
    int prime[1000]; //현재까지 찾은 소수의 개수-1

    int index = 1;
    int i;  //소수판별을 쓰이기 위한 변수
    int ok; //처음 두 소수는 특별한 경우로 친다

    prime[0] =2;
    prime[1] =3;
    for(;;){
        ok = 0;
        for(i=0; i<=index; i++){
            if(guess % prime[i] != 0){
                ok++;
            }else{
                break;
            }
        }

        if(ok == (index + 1)){
            index++;
            prime[index] = guess;
            printf("소수 : %d \n", prime[index]);
            if(index == 999){
                break;
            };
        }
        guess += 2;
    }
    return 0;

}
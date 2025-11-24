#include <stdio.h>
int main(){
    int a,b,c,d;
    a=10;
    b=3;
    printf("a + b 는 : %d \n", a + b);
    printf("a - b 는 : %d \n", a - b);
    printf("a * b 는 : %d \n", a* b);
    printf("a / b 는 : %d \n", a / b);
    printf("a %% b 는 : %d \n", a % b);


    a=b=c=d=5;  //대입연산자는 오른쪽의 항을 왼쪽에 대입, 뒤에서 부터 해석
    printf("a값 : %d\n",a);
    printf("b값 : %d\n",b);
    printf("c값 : %d\n",c);
    printf("d값 : %d\n",d);

    double x=3;
    printf("a/b값 (올바르지않음): %f \n", a/b); 
    // 정수형의 계산결과는 정수이다. 정수형으로 계산 후 소숫점이 된다 해도 
    // 실수형으로 출력불가
    printf("a/x값 : %f \n", a/x);
    printf("x/a값 : %f \n", x/a);
    // double이 int보다 큰 수이기 때문에 큰쪽으로 산술변환 후 도출
}
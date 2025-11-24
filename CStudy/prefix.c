#include <stdio.h>
int main() {
	int a = 0, sum = 0;
while(a<5){
		if(++a % 2 ==1)
			continue;
		sum += a;
	}
printf("%d",sum);
return 1;
}
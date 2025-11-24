#include <stdio.h>
void main() {
    int a = 0xB4;
    int b = 0xF0;
    printf("%x\n", a^b);
    printf("%x",a&b);
}
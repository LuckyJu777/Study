#include<stdio.h>
static int snum = 0;
int inum = 0;
void func(){
    snum++;
    inum++;
    printf("snum = %d, inum =%d\n", snum, inum);
}
int main(){
    func();
    snum++;
    inum++;
    func();
}
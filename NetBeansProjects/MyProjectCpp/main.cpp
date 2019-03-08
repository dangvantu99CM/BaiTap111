

#include <cstdlib>
#include <stdio.h>
#include <iostream>
using namespace std;
void doiCho(int *x,int *y);
int main(int argc, char** argv) {
    int a =2;
    int b = 10; 
    cout<<&a<<"\t"<<&b;
    doiCho(&a,&b);
    cout<<&a<<"\t"<<&b;
    return 0; 
}
void doiCho(int *x , int *y){
    int temp = *x; 
    *x = *y;
    *y = temp;
}


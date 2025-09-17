/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int array[3];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    
    
    int x = 10;
    int *ptr = &x;
    printf("x = %d\n", x);
    printf("&x = %p\n", &x);
    
    printf("ptr = %p\n", ptr);
    printf("*ptr = %d\n", *ptr);

    int array[3];
    
    //array[i] = i[array];
    //array[i] = (array+i)

    for(int i =0; i < 3; i++) {
        scanf("%d", (array+i));
    }    

    for(int i = 0; i < 3; i++) printf("%d ", *(&(*(array+i))));

    int array[3];
        array[0] = 1;
        array[1] = 2;   
        array[2] = 3;
        
    printf("Valores: ");
    printf("%d, %d, %d\n", array[0], *(&(*(array))), *(array+0));
    printf("Endereços: ");
    printf("%p, %p, %p\n", array, &(*(array)), &(*(array+0)));

    return 0;
}

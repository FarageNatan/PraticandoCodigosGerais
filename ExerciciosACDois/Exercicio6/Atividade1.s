.data
x: 
    .word 10

.text
main:
    lui s0, %hi(x)
    addi s0, s0, %lo(x) 
    
    li t1 , 7

    lw a0, s0, 0
    addi t0, zero, 1
    ecall

    sw t1, s0, 0
    lw a0, s0, 0
    ecall
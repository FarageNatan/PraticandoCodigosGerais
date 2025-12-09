.data
vetor:
    .word 10
    .word 20
    .word 30

.text
.globl main
main:

    # Carrega o endereco base do vetor em s0
    lui s0, %hi(vetor)
    addi s0, s0, %lo(vetor)

    # Registradores auxiliares
    li t2, 3          # tamanho do vetor
    li t3, 0          # indice (i = 0)

loop_incremento:
    beq t3, t2, imprime   # se i == 3, acabou

    # Calcula endereco do elemento s0 + 4 x i
    slli t4, t3, 2        # t4 = i x 4
    add t5, s0, t4        # t5 = &vetor[i]

    # Carrega elemento
    lw t6, 0(t5)

    # Incrementa
    addi t6, t6, 1

    # Salva de volta
    sw t6, 0(t5)

    # Incrementa indice i++
    addi t3, t3, 1

    j loop_incremento

imprime:
    li t3, 0              # i = 0

loop_imprime:
    beq t3, t2, fim

    slli t4, t3, 2        # offset = i*4
    add t5, s0, t4        # t5 = &vetor[i]
    lw a0, 0(t5)

    # Syscall print_int
    li t0, 1
    ecall

    #imprimir espaco
    li a0, 32
    li t0, 11
    ecall

    addi t3, t3, 1 
    j loop_imprime

fim:
    ret

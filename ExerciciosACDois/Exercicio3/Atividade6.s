main:
    addi t0, zero, 4
    ecall               #Leitura primeiro valor
    add s0, zero, a0    #Transfere valor para registrador
    addi t0, zero, 4
    ecall               #Leitura segundo valor
    add s1, zero, a0    #Transfere valor para registrador
    and s2, s0, s1 
    add a0, zero, s2
    addi t0, zero, 1
    ecall               #Imprime o resultado
    ret
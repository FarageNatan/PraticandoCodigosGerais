main:
    addi t0, zero, 4    
    ecall               #Leitura
    add s0, zero, a0   
    addi s1, s0, 2
    add a0, zero, s1
    addi t0, zero, 1
    ecall               #Escreve o valor armazenado em a0   
    ret
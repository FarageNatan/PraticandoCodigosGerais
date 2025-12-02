main:
    addi t0, zero, 4
    ecall               #Le o primeiro valor
    add s0, zero, a0    #Armazena o primeiro valor no registrador s0
    addi t0, zero, 4
    ecall               #Le o segundo valor
    add s1, zero, a0    #Armazena o segundo valor em s1
    add s3, s0, s1
    add a0, zero, s3    #Transfere o resultado para a0 para que ele possa ser escrito
    addi t0, zero, 1
    ecall               #Imprime o resultado
    ret
main:
    #Leitura do primeiro numero e armazena em s0
    addi t0, zero, 4
    ecall
    mv s0, a0
    #Leitura do segundo numero e armazena em s1
    addi t0, zero, 4
    ecall
    mv s1, a0
    #Se o numero armazenado em s0 for maior que o armazenado em s1 salta senao continua a execucao
    bgt s0, s1, maior
    #Move o maior numero para o registrador a0 e imprime
    mv a0, s1
    addi t0, zero, 1
    ecall
    #Final da execucao
    j fim

maior:
    #Move o maior numero para o registrador a0 e imprime o maior numero
    mv a0, s0
    addi t0, zero, 1
    ecall
    #Final da execucao
    j fim

fim:
    ret
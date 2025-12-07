main:
    #Leitura do primeiro numero e armazena em s0, cofere se eh igual a 0
    addi t0, zero, 4
    ecall
    mv s0, a0
    beq s0, zero, fim
    #Leitura do segundo numero e armazena em s1, confere se eh igual a 0
    addi t0, zero, 4
    ecall
    mv s1, a0
    beq s1, zero, fim
    #Se o numero armazenado em s0 for maior que o armazenado em s1 salta senao continua a execucao
    bge s0, s1, maiors0
    #Move o maior numero para o registrador a0 e imprime
    mv a0, s1
    addi t0, zero, 1
    ecall
    #Loop para executar o programa novamente
    j main

maiors0:
    #Move o maior numero para o registrador a0 e imprime o maior numero
    mv a0, s0
    addi t0, zero, 1
    ecall
    #Loop para executar o programa novamente
    j main

fim:
    ret
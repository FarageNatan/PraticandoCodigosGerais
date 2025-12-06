main:
    #Realiza a leitura de um numero e armazena em a0
    #Move o valor armazenado em a0 para o registrador t1
    addi t0, zero, 4
    ecall
    mv t1, a0

loop:
    #t1 == 0 encerra, senao, continua a execucao do programa
    beq t1, zero, fim
    #Soma 2 ao valor contido no registrador a0
    addi a0, a0, 2
    #Imprime o resultado da soma
    addi t0, zero, 1
    ecall
    j main

fim:
    ret

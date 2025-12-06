main:
    #Realiza a leitura de um numero e armazena em a0
    #Move o valor armazenado em a0 para o registrador t1
    addi t0, zero, 4
    ecall
    mv t1, a0

loop:
    #Soma 2 ao valor contido no registrador a0
    addi a0, a0, 2
    #Imprime o resultado da soma
    addi t0, zero, 1
    ecall
    #t1 == 0 encerra
    #senao volta para o inicio
    beq t1, zero, fim
    j main

fim:
    ret
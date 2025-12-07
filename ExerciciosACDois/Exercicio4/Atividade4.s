main:
    #Salva o maximo de execucoes e compara se o contador e maior ou igual ao limite
    addi t1, zero, 9
    j operacao

operacao:
    #Leitura de um valor e armazena o resultado em s1
    addi t0, zero, 4
    ecall
    mv s1, a0
    #Soma 2 ao valor armazenado em s1 e move novamente para a0
    addi s1, s1, 2
    mv a0, s1
    #Imprime o resultado e decrementa 1 do contador
    addi t0, zero, 1
    ecall
    addi t1, t1, -1
    #Se o contador for maior ou igual a 0 continua a execucao, senao encerra o programa
    bge t1, zero, operacao    

fim:
    ret
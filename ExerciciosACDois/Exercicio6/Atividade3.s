main:
    #Leitura de um caracter e armazena em s0
    addi t0, zero, 5
    ecall
    mv s0, a0
    #Operacao para transformar maiuscula em minuscula
    ori s0, s0, 32
    #Transfere o resultado para a0 e imprime
    mv a0, s0
    addi t0, zero, 2
    ecall

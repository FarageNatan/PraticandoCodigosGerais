main:
    #Leitura de um caracter e salva em s0
    addi t0, zero, 5
    ecall
    mv s0, a0
    #Realiza a operacao de min-maius e imprime o resultado
    andi a0, s0, 223
    addi t0, zero, 2
    ecall
    
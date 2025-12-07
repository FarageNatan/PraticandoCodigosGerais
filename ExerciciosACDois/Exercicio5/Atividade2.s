main:
    #Armazena o valor 1 para usar como comparador no beq
    addi s0, zero, 1
    #Armazena o valor 0000 0000 0001 no registrador s1
    addi s1, zero, 0001
    #Leitura do valor, salva em t1
    addi t0, zero, 4
    ecall
    mv t1, a0
    #Reliza a comparacao de bits por meio da operacao and, salva o resultado em s1
    and s1, t1, s1
    #Se o numero for impar salta, senao continua sequencial
    beq s0, s1, impar
    #Carrega o codigo da letra P no a0 e imprime
    addi a0, zero, 80
    addi t0, zero, 2
    ecall
    j fim

impar:
    #Carrega o codigo da letra I no a0 e imprime
    addi a0, zero, 73
    addi t0, zero, 2
    ecall
    j fim

fim:
    ret
    

main:
    #Leitura dos dois numeros, salva em s0 e s1, respectivamente
    addi t0, zero, 4
    ecall
    mv s0, a0 #s0 = Segredo
    addi t0, zero, 4
    ecall
    mv s1, a0 #s1 = Numero a codificar
    #Realiza a codificacao
    xor s2, s0, s1
    #Salva em a0 e imprime o numero codificado
    mv a0, s2
    addi t0, zero, 1
    ecall


main:
    #Determina o valor de x e salva no registrador s0
    addi t0, zero, 4
    ecall
    mv s1, a0 #x = s1 = 10
    #Determina o valor de y e salva no registrador s2
    addi t0, zero, 4
    ecall
    mv s2, a0 #y = s2 = 5
    #Salva em t3 - 10 * 4
    slli t3, s1, 2
    #Multiplica s1 por 16
    slli s1, s1, 4
    #Subtrai s1 pelo valor armazenado em t3, resultando na multiplicacao equivalente a 12, armazena o resultado em t3
    sub t3, s1, t3 #t3 = x * 12
    #Salva em s2 - y * 64
    slli s2, s2, 6
    #Salva em t4 - 5 * 2
    slli t4, a0, 1
    #Faz a soma s2 + t4 para dar o resultado equivalente a y * 66, armazena em s2
    add s2, s2, t4 #s2 = y * 66
    #Faz a soma do resultado das duas multiplicacoes de dentro do parenteses e armazena o novo resultado em s3
    add s3, s2, t3
    #Multiplica o resultado da soma por 4 - Realiza a multiplicacao de fora dos parenteses e armazena o resultado final em s3
    slli s3, s3, 2
    #Move o resultado final para a0 e imprime
    mv a0, s3
    addi t0, zero, 1
    ecall
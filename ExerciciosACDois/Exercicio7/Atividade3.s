.data
vetor1:
    .word 10
    .word 20
    .word 30
    .word 40
    .word 50

vetor2:
    .word 50
    .word 40
    .word 30
    .word 20
    .word 10

vetor3:
    .word 0
    .word 0
    .word 0
    .word 0
    .word 0

.text
main:
    #Carrega o endereco do vetor1 no registrador s0
    lui s0, %hi(vetor1)
    addi s0, s0, %lo(vetor1)
    #Carrega o endereco do vetor2 no registrador s1
    lui s1, %hi(vetor2)
    addi s1, s1, %lo(vetor2)
    #Carrega o endereco do vetor3 no registrador s2
    lui s2, %hi(vetor3)
    addi s2, s2, %lo(vetor3)

    #Indice dos vetores
    add t1, zero, zero #i = 0
    addi t2, zero, 4 #tamanho vetor

somaMesmoIndice:
    beq t1, t2, somaTerceiro #indice = tamanho vetor

    slli t3, t1, 2 #i x 4 - atualiza os bits
    add t4, s0, t3
    lw t5, 0(t4)

    # vetor2[i]
    add t4, s1, t3
    lw t6, 0(t4)

    # soma dos elementos
    add s3, t5, t6             # s3 = vetor1[i] + vetor2[i]

    # armazenar em vetor3[i]
    add t4, s2, t3
    sw s3, 0(t4)

    # i++
    addi t1, t1, 1
    j somaMesmoIndice


somaTerceiro:
    somaTerceiro:
    addi t1, zero, 0     # i = 0
    addi s4, zero, 0     # acumulador

somaLoop:
    beq t1, t2, imprime  # se i == 5, imprime resultado

    slli t3, t1, 2       # offset = i * 4
    add t4, s2, t3       # endereco de vetor3[i]
    lw t5, 0(t4)         # carrega vetor3[i]

    add s4, s4, t5       # soma no acumulador

    addi t1, t1, 1
    j somaLoop

imprime:
    mv a0, s4            
    addi t0, zero, 1     
    ecall
    j fim




fim:
    ret






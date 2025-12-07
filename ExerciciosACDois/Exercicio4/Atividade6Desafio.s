main:
    #Armazena o valor a ser subtraido
    addi s0, zero, 10
    # le um numero do teclado e armazena valor em s1
    addi t0, zero, 4
    ecall
    mv s1, a0
    #Se os dois valores forem iguais o resultado deve ser 0
    beq s0, s1, valorzero
    #Se o valor digitado for maior que o subtrator o resultado eh positivo e salta, senao o valor eh negativo e continua a execucao sequencial
    bge s1, s0, positivo
    #Realiza a subtracao
    sub s2, s0, s1
    #Armazena o caracter negativo em a0, numero 45 na tabela ascii e faz a chamada de sistema para imprimir um caracter
    addi a0, zero, 45
    addi t0, zero, 2
    ecall
    #Salva em a0 o resultado numerico da subtracao e imprime formando o numero negativo
    mv a0, s2
    addi t0, zero, 1
    ecall
    j fim

valorzero:
    mv a0, zero
    addi t0, zero, 1
    ecall
    j fim

positivo:
    sub s2, s1, s0
    mv a0, s2
    addi t0, zero, 1
    ecall

fim:
    ret
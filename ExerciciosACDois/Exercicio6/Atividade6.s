main:
    #Salva os limites e Letra A ate F
    li t1, 65 #A
    li t2, 70 #F
    li t3, 10 #A
    li t4, 15 #F
    li t5, 70 #contador para atribuir o valor futuramente
    #Leitura de um numero, salva em s0
    addi t0, zero, 4
    ecall
    mv s0, a0
    #Confere se vai ser numero ou letra
    bge s0, t3, ehLetra
    #Continua se for numero
    li t0, 1
    ecall
    addi a0, zero, 104
    li t0, 2
    ecall
    j fim
    

ehLetra:
    #Se cair aqui o numero ja eh maior que 10, sendo assim vira letra e vai rodar ate achar uma letra do hexa que corresponde ao numero em decima
    beq s0, t4, achouLetra
    addi t5, t5, -1
    addi t4, t4, -1
    j ehLetra

achouLetra:
    add a0, zero, t5
    li t0, 2
    ecall
    j fim
    
fim:
    ret



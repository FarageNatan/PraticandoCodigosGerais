main:
    #Inicializa os registradores para armazenar a soma dos impares e a soma dos pares
    add s0, zero, zero #Armazena a soma dos pares
    add s1, zero, zero #Armazena a soma dos impares
    #Salva no registrador t1 o valor 1 para verificar se eh impar
    addi t1, zero, 1
    #Pula para realizar a funcao e evita que registradores sejam zerados
    jal zero, funcao

funcao:
    #Realiza a leitura de um numero e salva em t2 e compara se ele eh igual a zero, flag de parada
    addi t0, zero, 4
    ecall
    beq a0, zero, diferencaParImpar
    mv t2, a0 #t2 armazena o numero lido
    #Se o numero digitado for impar salta, senao continua sequencial
    and t3, t2, t1
    beq t3, t1, ehImpar 
    j ehPar

ehImpar:
    #Soma ao registrador dos impares o valor lido e retorna para a funcao
    add s1, s1, t2
    j funcao

ehPar:
    #Soma ao registrador dos pares o valor lido e retorna para a funcao
    add s0, s0, t2
    j funcao

diferencaParImpar:
    #Realiza a diferenca entre a soma dos numeros impares e a soma dos numeros pares e imprime o resultado
    sub a0, s1, s0
    addi t0, zero, 1
    ecall
    j fim

fim:
    ret
main:
    addi t0, zero, 4    
    ecall               #Equivalente a leitura de um numero
    add s0, zero, a0    #Lembrar que o valor lido vai para o registrador a0 e nao para o t0 indicado na instrucao de leitura
    addi s1, s0, 2      #Valor final sera armazenado no registrador s0
    ret
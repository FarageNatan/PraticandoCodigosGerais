main:
    #Armazena o valor 4 em t1
    addi t1, zero, 4
    #Leitura de um numero, armazena em s0
    addi t0, zero, 4
    ecall
    mv s0, a0
    #Divide o numero digitado por 4, armazena em t2
    srl t2, s0, t1
    #Se o resultado da divisao for igual a 0 eh multiplo, realiza o salto
    beq t2, zero, ehMultiplo
    #Nao eh multiplo
    addi a0, zero, 78
    addi t0, zero, 2
    ecall
    j fim

ehMultiplo:
    #Armazena o codigo da letra S em a0 e imprime
    addi a0, zero, 83
    addi t0, zero, 2
    ecall
    j fim

fim:
    ret
 
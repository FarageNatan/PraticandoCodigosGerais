main:
    #Armazena os valores limites de maiusculas e minusculas
    li t1, 65      # A
    li t2, 90      # Z
    li t3, 97      # a
    li t4, 122     # z
    #Armazena valores booleanos
    addi t5, zero, 1
    addi t6, zero, 0
    #Leitura de um caracter, salva em s0
    addi t0, zero, 5
    ecall
    mv s0, a0
    blt s0, t1, testa_minuscula   # se menor A, vai pra minuscula (ou erro)
    bgt s0, t2, testa_minuscula   # se maior Z, vai pra minuscula

    # Aqui sabemos que e MAIUSCULA
    ori a0, s0, 32   # maiuscula para minuscula
    li t0, 2        
    ecall
    j fim

testa_minuscula:
    blt s0, t3, fim    # se menor a, nao eh letra
    bgt s0, t4, fim    # se maior z, nao eh letra

    # Aqui sabemos que e MINUSCULA
    andi a0, s0, 223   # minuscula para maiuscula
    li t0, 2          
    ecall

fim:
    ret
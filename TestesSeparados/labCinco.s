main:
    # LER O NUMERO
    addi t0, zero, 4   # CODIGO PARA LER INTEIRO
    ecall              # O NUMERO LIDO ESTA EM a0 (O VALOR A SER IMPRESSO)
    mv s0, a0          # SALVA O NUMERO ORIGINAL EM S0
    
    # --- INICIALIZACAO DO LOOP ---
    addi s1, zero, 32  # S1 E O CONTADOR DO LOOP (DE 32 A 0)
    addi t2, zero, 1   # T2 E A MASCARA INICIAL (0x1)

    # CRIA UMA MASCARA PARA O BIT 31 (POSICAO MAIS A ESQUERDA)
    slli t3, t2, 31    # T3 RECEBE 0x80000000 (A MASCARA INICIAL)
    
loopbinario:
    # 1. CONDICAO DE PARADA (LACO FOR DECRESCENTE)
    beq s1, zero, fim # SE S1 E ZERO O LACO TERMINOU

    # 2. TESTA O BIT ATUAL
    # AND entre o numero (S0) e a mascara (T3)
    and t4, s0, t3     # T4 RECEBE O RESULTADO DO AND

    # 3. DECISAO E IMPRESSAO
    beqz t4, printzero # SE T4 FOR ZERO, O BIT E 0

    # --- IMPRIME 1 ---
    addi a0, zero, 49  # A0 RECEBE O CODIGO ASCII DE 1
    j printbit
    
printzero:
    # --- IMPRIME 0 ---
    addi a0, zero, 48  # A0 RECEBE O CODIGO ASCII DE 0

printbit:
    addi t0, zero, 11  # CODIGO PARA IMPRIMIR CARACTERE
    ecall
    
    # 4. ATUALIZA O CONTADOR E A MASCARA
    srli t3, t3, 1     # DESLOCA A MASCARA UM BIT PARA A DIREITA (PROXIMO BIT)
    addi s1, s1, -1    # DECREMENTA O CONTADOR
    
    # 5. CONTINUA O LOOP
    j loopbinario

fim:
    # FIM DO PROGRAMA
    addi t0, zero, 10  # CODIGO PARA SAIR
    ecall
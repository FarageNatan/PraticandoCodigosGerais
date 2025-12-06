main:
  # Le um numero do teclado e armazena em a0
    addi t0, zero, 4
    ecall
  # Move o numero somado para o registrador s1 e soma 2 ao valor de a0
    mv s1, a0
    addi a0, a0, 2
  # Imprima o valor de a0 na tela
    addi t0, zero, 1
    ecall
  # Va novamente para o main e recomece a execucao
  beq s1, zero, ret
  j main

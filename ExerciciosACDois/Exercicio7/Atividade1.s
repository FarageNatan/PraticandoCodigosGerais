.data
vetor: 
    .word 10
    .word 20
    .word 30

.text
main:
    #Carrega no registrador s0 o endereco de memoria que esta guardado o valor 10, o registrador t0 recebe esse valor - 10
    lui s0, %hi(vetor)
    addi s0, s0, %lo(vetor)
    lw t0, s0, 0
    add t1, t1, t0 #t1 vai armazenar a soma dos elementos do vetor
    #Carrega no registrador s0 o endereco de memoria que esta guardado o valor 20 e atualiza t0 com a soma
    lw t0, s0, 4
    add t1, t1, t0 #atuliza o somador
    #Procura o proximo elemento e som
    lw t0, s0, 8
    add t1, t1, t0 #atualiza o somador
    mv a0, t1
    addi t0, zero, 1
    ecall
    ret
main:
  addi t0, zero, 2047        # t0 = 0 + 2047 valor no campo de instrucao fica como 0000
  addi t1, zero, 100         # t1 = 0 + 100 
  add  t2, t1, t0            # t2 = t1 + t0 
  ret
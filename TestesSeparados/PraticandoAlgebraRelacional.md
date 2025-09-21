/*Projetar o primeiro nome e o último nome dos atores de sexo feminino;*/
A = σgender = 'F'(actors)
π first_name, last_name (A)
/*Projetar o nome dos filmes com ano superior à 1999;*/
B = σyear > 1999 (movies)
π name (A)
/*Projetar o nome do filme e o nome do diretor de cada filme;*/
temp = ρ filmeId ← id ( movies )
A = temp ⨝ filmeId = movie_id (movies_directors)
B = A ⨝ director_id = id (directors)
πname, first_name, last_name (B)
/*Projetar o nome do filme, nome do ator e o papel que cada ator teve no filme para filmes com ranking acima da nota 6;*/
aux = σrank > 6 (movies)
temp = ρ filmeId ← id ( movies )
MOV_ROL = temp ⨝ filmeId = movie_id (roles)
MOV_ACT = MOV_ROL ⨝ actor_id = id (actors)
π name, first_name, last_name, role (MOV_ACT)
/*Projetar o nome do diretor e o número de filmes que cada diretor dirigiu;*/
num = γ director_id;count(movie_id) → total ( movies_directors )
MOV_DIR = num ⨝ director_id = id (directors)
π first_name, last_name, total ( MOV_DIR )
/*Projetar o gênero e o número de filmes de cada gênero;*/
γ genre;count(movie_id)→Total ( movies_genres )
/*Projetar o gênero, o ranking (nota) médio, mínimo e máximo dos filmes do gênero.*/
GEN_MOV = (movies_genres) ⨝ movie_id = id (movies)
γ genre;avg(rank) → Medio, min (rank) → Minimo , max(rank) → Maximo (GEN_MOV)


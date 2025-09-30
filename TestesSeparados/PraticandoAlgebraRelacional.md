# ----- HANDS ON 4 -------

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

# ----- HANDS ON 5 -------

/*Projetar o primeiro nome e o último nome dos atores que são diretores;*/
A = π first_name, last_name ( actors )
B = π first_name, last_name ( directors )
A ∩ B
/*Projetar o primeiro nome e o último nome dos atores que não são diretores;*/
A = π first_name, last_name ( actors )
B = π first_name, last_name ( directors )
A - B
/*Projetar o primeiro nome e o último nome dos atores e diretores;*/
A = π first_name, last_name ( actors )
B = π first_name, last_name ( directors )
A ∪ B

# ----- HANDS ON 7 SQL-------
/*Projetar o primeiro nome e o último nome dos atores de sexo feminino;*/
SELECT first_name, last_name
FROM actors
WHERE gender = 'F';
/*Projetar o nome dos filmes com ano superior à 1999*/
SELECT name
FROM movies
WHERE year > 1999;
/*Projetar o nome do filme e o nome do diretor de cada filme;*/
SELECT
    T1.name,
    T3.first_name,
    T3.last_name
FROM
    movies as T1
INNER JOIN
    movies_directors as T2 ON T1.id = T2.movie_id
INNER JOIN
    directors as T3 ON T2.director_id = T3.id;
/*Projetar o nome do filme, nome do ator e o papel que cada ator teve no filme para filmes com ranking acima da nota 6;*/
SELECT 
	A.name, B.role, C.first_name, C.last_name
FROM 
	movies as A
JOIN
	roles as B ON B.movie_id = A.id
JOIN
	actors as C ON B.actor_id = C.id
WHERE
	A.rank > 6;
/*Projetar o nome do diretor e o número de filmes que cada diretor dirigiu;*/
SELECT
    A.first_name,
    A.last_name,
    COUNT(B.movie_id) AS total_filmes
FROM
    directors AS A
INNER JOIN
    movies_directors AS B ON B.director_id = A.id
GROUP BY
    A.first_name,
    A.last_name;
/*Projetar o gênero e o número de filmes de cada gênero;*/
SELECT 
	A.genre,
	COUNT(A.movie_id) as filmes_genero
FROM
	movies_genres as A
GROUP BY
	A.genre
/*Projetar o gênero, o ranking (nota) médio, mínimo e máximo dos filmes do gênero.*/
SELECT
    A.genre AS Genero,
    AVG(B.rank) AS RankMedio,
    MAX(B.rank) AS RankMaximo,
    MIN(B.rank) AS RankMinimo
FROM
    movies_genres AS A  -- Tabela de Gêneros (para obter o nome do gênero)
INNER JOIN
    movies AS B ON A.movie_id = B.id  -- Tabela de Filmes (para obter o rank)
GROUP BY
    A.genre;

# ----- EXERCICIOS CHAT SQL-------
/*Projetar o primeiro nome e o último nome dos atores de sexo masculino.*/
SELECT first_name, last_name
FROM actors
WHERE gender = 'M';
/*Projetar o nome dos filmes lançados antes do ano 1980.*/
SELECT name
FROM movies
WHERE year < 1980;
/*Projetar o nome do filme e o gênero a que ele pertence*/
SELECT A.name, B.genre
FROM movies as A join movies_genres as B ON A.id = B.movie_id
/*Projetar o nome do filme, nome do diretor e o ano, apenas para filmes dirigidos após 2010.*/
SELECT A.name, A.year, B.first_name, B.last_name
FROM movies as A JOIN movies_directors as C ON A.id = C.movie_id
JOIN directors as B ON B.id = C.director_id
WHERE A.year > 2000
/*Projetar o nome do ator e todos os filmes em que ele participou no papel de “Narrator” (narrador).*/
SELECT A.first_name, A.last_name, B.role
FROM actors as A JOIN roles as B ON B.actor_id = A.id
WHERE B.role = 'Narrator'
/*Projetar o nome do diretor e o nome do ator para cada filme em comum (filmes que o diretor dirigiu e o ator participou).*/
SELECT DISTINCT
       CONCAT(d.first_name, ' ', d.last_name) AS Diretor,
       CONCAT(a.first_name, ' ', a.last_name) AS Ator,
       m.name AS Filme
FROM movies AS m
JOIN movies_directors AS md ON m.id = md.movie_id
JOIN directors AS d ON md.director_id = d.id
JOIN roles AS r ON m.id = r.movie_id
JOIN actors AS a ON r.actor_id = a.id
ORDER BY Diretor, Ator, Filme;
/*Projetar o gênero e a quantidade de atores que participaram de filmes desse gênero.*/

/*Projetar o nome do filme e o ranking (nota) apenas para filmes cujo ranking seja menor que 5.*/

/*Projetar o nome do diretor e o gênero mais frequente que ele dirigiu (dica: usar GROUP BY e COUNT).*/

/*Projetar o gênero e a média de ano de lançamento dos filmes desse gênero.*/


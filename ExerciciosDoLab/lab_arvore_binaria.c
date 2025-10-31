#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct No {
    int elemento;
    struct No *esq, *dir;
} No;

typedef struct {
    No* raiz;
} ArvoreBinaria;

No* newNo(int elemento) {
    No* no = (No*) malloc(sizeof(No));
    no->elemento = elemento;
    no->esq = no->dir = NULL;
    return no;
}

void deleteNo(No* no) {
    no->esq = no->dir = NULL;
    free(no);
}

ArvoreBinaria* newArvoreBinaria() {
    ArvoreBinaria* arvore = (ArvoreBinaria*) malloc(sizeof(ArvoreBinaria));
    arvore->raiz = NULL;
    return arvore;
}

void _deleteArvoreBinaria(No* i) {
    if(i != NULL) {
        _deleteArvoreBinaria(i->esq);
        _deleteArvoreBinaria(i->dir);
        deleteNo(i);
    }
}

void deleteArvoreBinaria(ArvoreBinaria* arvore) {
    _deleteArvoreBinaria(arvore->raiz);
    arvore->raiz = NULL;
    free(arvore);
}

No* _inserir(ArvoreBinaria* arvore, int x, No* i) {
    if (i == NULL) {
        i = newNo(x);
    }
    else if (x < i->elemento) {
        i->esq = _inserir(arvore, x, i->esq);
    }
    else if(x > i->elemento) {
        i->dir = _inserir(arvore, x, i->dir);
    } else {
        //Não haverá chave duplicada nesse exercício
    }
    
    return i;
}

void inserir(ArvoreBinaria* arvore, int x) {
    arvore->raiz = _inserir(arvore, x, arvore->raiz);
}

int _pesquisar(ArvoreBinaria* arvore, int x, No* i) {
    int resp;
    if (i == NULL) {
        resp = 0;
    }
    else if (x == i->elemento) {
        printf("%d ", i->elemento);
        resp = 1;
    }
    else if(x < i->elemento) {
        printf("%d ", i->elemento);
        resp = _pesquisar(arvore, x, i->esq);
    }
    else {
        printf("%d ", i->elemento);
        resp = _pesquisar(arvore, x, i->dir);
    }
    return resp;
}

int pesquisar(ArvoreBinaria* arvore, int x) {
    return _pesquisar(arvore, x, arvore->raiz);
}

int _isVazia(ArvoreBinaria* arvore) {
    return arvore->raiz == NULL;
}

void _caminharPre(ArvoreBinaria* arvore, No* i) {
    if (i != NULL) {
        printf("%d ", i->elemento);
        _caminharPre(arvore, i->esq);   
        _caminharPre(arvore, i->dir);   
    }
}

void _caminharPos(ArvoreBinaria* arvore, No* i) {
    if (i != NULL) {
        _caminharPos(arvore, i->esq);   
        _caminharPos(arvore, i->dir);
        printf("%d ", i->elemento);  
    }
}

void _caminharEm(ArvoreBinaria* arvore, No* i) {
    if (i != NULL) {
        _caminharEm(arvore, i->esq);
        printf("%d ", i->elemento); 
        _caminharEm(arvore, i->dir);
    }
}

void caminharPre(ArvoreBinaria* arvore) {
    if (_isVazia(arvore)) {
        printf("V\n");
    }
    else {
        _caminharPre(arvore, arvore->raiz);
        printf("\n");   
    }
}

void caminharPos(ArvoreBinaria* arvore) {
    if (_isVazia(arvore)) {
        printf("V\n");
    }
    else {
        _caminharPos(arvore, arvore->raiz);
        printf("\n");   
    }
}

void caminharEm(ArvoreBinaria* arvore) {
    if (_isVazia(arvore)) {
        printf("V\n");
    }
    else {
        _caminharEm(arvore, arvore->raiz);
        printf("\n");   
    }
}


 
int main() {
    char op[20];
    int elem;
    ArvoreBinaria* arvore = newArvoreBinaria();

    while (scanf(" %s", op) != EOF) {
        if (strcmp(op, "I") == 0) {
            scanf("%d", &elem);
            inserir(arvore, elem);
        }
        else if (strcmp(op, "P") == 0) {
            scanf("%d", &elem);
            if (pesquisar(arvore, elem)) {
                printf("S\n");
            }
            else {
                printf("N\n");
            }
            
        }
        else if (strcmp(op, "PRE") == 0) {
            caminharPre(arvore);           
        }
        else if (strcmp(op, "POS") == 0) {
            caminharPos(arvore);    
        }
        else if (strcmp(op, "EM") == 0) {
            caminharEm(arvore);        
        }
    }
    
    deleteArvoreBinaria(arvore);
    return 0;
}
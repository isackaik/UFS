Algoritmo: Problema de todos os menores caminhos

Greg tem um grafo direcionado ponderado, consistindo de n vértices. Neste grafo qualquer par de vértices distintos tem uma aresta entre eles em ambas as direções. Greg adora brincar com o grafo e agora inventou um novo jogo:

- O jogo consiste em n passos.
- Na i -ésima etapa, Greg remove o número do vértice x i do grafo. À medida que Greg remove um vértice, ele também remove todas as arestas que entram e saem desse vértice.
- Antes de executar cada etapa, Greg deseja saber a soma dos comprimentos dos caminhos mais curtos entre todos os pares de vértices restantes. O caminho mais curto pode passar por qualquer vértice restante. Em outras palavras, se assumirmos que d(i , v , u ) é o caminho mais curto entre os vértices v e u no grafo que se formou antes de deletar o vértice x i , então Greg quer saber o valor da seguinte soma:somatório de v, u, v!=u, d(i,v,u).
Ajude Greg, imprima o valor da soma necessária antes de cada etapa.

Entrada:
A primeira linha contém o inteiro n (1 ≤  n  ≤ 500) — o número de vértices no grafo.
As próximas n linhas contêm n inteiros cada — a matriz de adjacência do grafo: o j -ésimo número na i -ésima linha Aij representa o peso da aresta que vai do vértice i ao vértice j .
A próxima linha contém n inteiros distintos: X1, X2,..., Xn - os vértices que Greg exclui.

Saída:
Imprima n inteiros — o i -ésimo número é igual à soma necessária antes da i -ésima etapa.

Exemplo 1:		Saída:
1			0
0
1

Exemplo 2:		Saída:
2			9 0
0 5
4 0
1 2

Exemplo 3: 		Saída:
4			17 23 404 0 
0 3 1 1
6 0 400 1
2 4 0 1
1 1 1 0
4 1 2 3


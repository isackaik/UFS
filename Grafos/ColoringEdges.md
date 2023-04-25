Algoritmo: Busca em profundidade em dígrafos

Você recebe um grafo direcionado com n vértices e m arestas direcionadas sem ciclos ou arestas múltiplas.
Vamos denotar a k-coloração de um dígrafo da seguinte forma: você colore cada aresta em uma das k-cores. A k-coloração é boa se e somente se não houver ciclo formado por uma aresta de mesma cor.
Encontre uma boa k-coloração do dígrafo dado com o mínimo possível k.

Entrada:
A primeira linha contém dois inteiros n e m, o número de vértices e arestas no dígrafo, respectivamente.
As próximas m linhas contêm a descrição das arestas — uma por linha. Cada aresta é um par de inteiros u e v - há aresta direcionada de u para v no grafo
É garantido que cada par ordenado
(u,v) aparece na lista de arestas no máximo uma vez.

Saída:
Na primeira linha, imprima um único inteiro k - o número de cores usadas em uma boa k-coloração de determinado grafo.
Na segunda linha imprimir m inteiros C1, C2,..., Cm, onde Ci é uma cor da i-ésima aresta (na ordem em que são dadas na entrada).
Se houver várias respostas, imprima qualquer uma delas (você ainda precisa minimizar k).

Exemplo 1: 			Saída:
4 5				1
1 2				1 1 1 1 1
1 3
3 4
2 4
1 4

Exemplo 2: 			Saída:
3 3				2
1 2				1 1 2
2 3
3 1




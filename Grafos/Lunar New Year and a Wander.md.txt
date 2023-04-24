Algoritmo: Busca em profundidade

O Ano Novo Lunar está se aproximando e Bob decide passear em um parque próximo.
O parque pode ser representado como um grafo conexo com n nós e m arestas bidirecionais. Inicialmente Bob está no nó 1 e ele grava 1 no caderno dele. Ele pode vagar de um nó para outro através dessas arestas bidirecionais. Sempre que ele visita um nó não registrado em seu notebook, ele o registra. Depois que ele visita todos os nós pelo menos uma vez, ele para de vagar, assim, finalmente, uma permutação de nós A1, A2,..., An está gravado.

Vagar é uma coisa chata, mas resolver problemas é fascinante. Bob quer saber a menor sequência lexicograficamente de nós que ele pode registrar enquanto vagueia. Bob acha que esse problema é trivial e quer que você o resolva.

Uma sequencia x é lexicograficamente menor que uma sequência y se, e somente se, uma das condições a seguir forem válidas:
- x é um prefixo de y, mas x != y (isso é impossível neste problema, pois todas as sequências consideradas têm o mesmo comprimento);
- Na primeira posição onde x e y diferem, a sequência x tem um elemento menor que o elemento correspondente em y.

Entrada:
A primeira linha contém dois inteiros positivos, n e m - denotando o número de nós e arestas, respectivamente.
A seguir m linhas descrevem as arestas bidirecionais no gráfico. A i-ésima dessas linhas contém dois inteiros Ui e Vi, representando os nós da i-ésima aresta conectada.
Observe que o grafo pode ter várias arestas conectando os mesmos dois nós e auto-loops. É garantido que o grafo está conectado.

Saída:
Emita uma linha contendo a menor sequência lexicograficamente A1, A2,..., An Bob pode gravar.

Exemplo 1:		Saída:
3 2			1 2 3
1 2
1 3

Exemplo 2:		Saída:
5 5			1 4 3 2 5 
1 4
3 4
5 4
3 2
1 5

Exemplo 3: 		Saída:
10 10			1 4 3 7 9 8 6 5 2 10 
1 4
6 8
2 5
3 7
9 4
5 6
3 4
8 10
8 9
1 10

Na primeira amostra, o caminho ideal de Bob poderia ser 1→2→1→31→2→1→3. Portanto, Bob obterá a sequência {1,2,3}, que é o lexicograficamente menor.
Na segunda amostra, o caminho ideal de Bob poderia ser 1→4→3→2→3→4→1→5. Portanto, Bob obterá a sequência
{1,4,3,2,5}, que é o lexicograficamente menor.
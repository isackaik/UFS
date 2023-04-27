Algoritmo: Árvore geradora mínima

Você recebe um grafo não direcionado que consiste em n vértices. Um número é escrito em cada vértice; o número no vértice i é A(i). Inicialmente não há arestas no grafo.

Você pode adicionar algumas arestas a este gráfico, mas terá que pagar por elas. O custo de adicionar uma aresta entre os vértices X e Y é Ax + Ay. Há também m ofertas especiais, cada uma delas é indicada por três números, X, Y e W. Significa que você pode adicionar uma aresta conectando os vértices X e Y e pagar W em moedas para isso. Você não precisa usar ofertas especiais: se houver um par de vértices X e Y e houver uma oferta especial associada ela, você ainda pode conectar esses dois vértices pagando Ax + Ay moedas.

Qual é o número mínimo de moedas que você precisa gastar para tornar o gráfico conectado? Lembre-se de que um grafo é conexo se for possível ir de qualquer vértice a qualquer outro vértice usando apenas as arestas desse grafo.

Entrada:
A primeira linha contém dois inteiros n e m - o número de vértices no grafo e o número de ofertas especiais, respectivamente.
A segunda linha contém n inteiros - os números escritos nos vértices.
Então seguem m linhas, cada uma contendo três números inteiros x, y, m, denotando uma oferta especial: você pode adicionar uma aresta de conexão entre x e y, e pagar m moedas.

Saída:
Imprime um inteiro - o número mínimo de moedas a ser paga para deixar o grafo conectado.

Exemplo 1:		Saída:
3 2			5
1 3 3
2 3 5
2 1 1

Exemplo 2:		Saída:
4 0			16
1 3 3 7

Exemplo 3:		Saída:
5 4			18
1 2 3 4 5
1 2 8
1 3 10
1 4 7
1 5 15

No primeiro exemplo é possível conectar 1 para 2 usando oferta especial 2, e então 1 para 3 sem usar nenhuma oferta.

Nos próximos dois exemplos, a resposta ideal pode ser alcançada sem o uso de ofertas especiais.

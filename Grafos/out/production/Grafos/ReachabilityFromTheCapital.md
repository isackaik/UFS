Há n cidades e m estradas em Berland. Cada estrada conecta um par de cidades. As estradas em Berland são de mão única.
Qual é o número mínimo de novas estradas que precisam ser construídas para tornar todas as cidades acessíveis a partir da capital?
Novas estradas também serão de mão única.

Entrada:
A primeira linha de entrada consiste em três inteiros n, m e s, o número de cidades, o número de estradas e o índice da capital. As cidades são indexadas a partir de 1 para n.
A seguir m linhas contém estradas: estrada i é dada como um par de cidades Ui e Vi. Para cada par de cidades (u,v) pode haver no máximo uma estrada de u para v. Estradas em direções opostas entre um par de cidades são permitidas (ou seja, de u para v e de v para u).

Saída:
Imprima um inteiro — o número mínimo de estradas extras necessárias para tornar todas as cidades acessíveis a partir da cidade s. Se todas as cidades já estiverem acessíveis a partir de s, imprimir 0.

Exemplo 1:			Saída:
9 9 1				3
1 2
1 3
2 3
1 5
5 6
6 1
1 8
9 8
7 1

Exemplo 2:			Saída:
5 4 5				1
1 2
2 3
3 4
4 1




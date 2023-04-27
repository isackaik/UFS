Algoritmo: Busca em profundidade

Igor está no museu e quer ver o máximo de fotos possível.
O museu pode ser representado como um campo retangular de n  ×  m células. Cada célula está vazia ou intransponível. Células vazias são marcadas com ' . ', células intransponíveis são marcadas com ' * '. Cada duas células adjacentes de diferentes tipos (uma vazia e outra intransponível) são divididas por uma parede contendo uma imagem.
No início, Igor está em alguma célula vazia. A qualquer momento ele pode se mover para qualquer célula vazia que compartilhe um lado com a atual.
Para várias posições iniciais, você deve calcular o número máximo de fotos que Igor pode ver. Igor só consegue ver a foto se estiver na cela adjacente à parede com esta foto. Igor tem muito tempo, então ele examinará todas as fotos que puder ver.

Entrada:
A primeira linha da entrada contém três inteiros n , m e k — as dimensões do museu e o número de posições iniciais a serem processadas.
Cada uma das próximas n linhas contém m símbolos ' . ', ' * ' — a descrição do museu. É garantido que todas as celas fronteiriças são intransitáveis, então Igor não pode sair do museu.
Cada uma das últimas k linhas contém dois inteiros x e y — a linha e a coluna de uma das posições iniciais de Igor, respectivamente. As linhas são numeradas de cima para baixo, as colunas - da esquerda para a direita. É garantido que todas as posições iniciais sejam células vazias.

Saída:
Imprimir k inteiros — o número máximo de imagens que Igor pode ver se começar na posição correspondente.

Exemplo 1:		Saída:
5 6 3			6
******			4
*..*.*			10
******
*....*
******
2 2
2 5
4 3

Exemplo 2: 		Saída:
4 4 1			8
****
*..*
*.**
****
3 2




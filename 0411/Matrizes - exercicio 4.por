programa
{
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal:*/
	
	funcao inicio()
	{
		const inteiro linha = 3, coluna = 3
		inteiro matriz[linha][coluna]
		inteiro diagonal = 0, soma = 0
		
		para(inteiro l=0; l<linha;l++){
			para (inteiro c = 0; c < coluna; c++){
				escreva("Digite o valor da linha ", l , " e coluna ", c, ": ")
				leia(matriz[l][c])
				
				diagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]
				soma = soma + matriz[l][c]
			}
		}
		escreva("\nA soma da diagonal principal é: ", diagonal)
		escreva("\nA soma da matriz é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 10, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
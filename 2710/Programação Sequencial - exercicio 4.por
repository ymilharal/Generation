programa
{
	//Escrevendo um sistema que leia três numeros inteiros e positivos
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real A,B,C,R,S,D

	escreva("Digite o valor correspondente a letra A: ")
	leia(A)
	
	escreva("Digite o valor correspondente a letra B: ")
	leia(B)
	
	escreva("Digite o valor correspondente a letra C: ")
	leia(C)

	R= mat.potencia(A + B, 2.0)
	escreva("O valor de R é: ", R)
	S= mat.potencia(B + C, 2.0)
	escreva("\nO valor de S é: ", S)

	D= (R+S) /2

	escreva("\nO resultado da expressão será: ", D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	// ex 7
	funcao inicio()
	{
	//coeficientes
	real a, b, c, d, E, f
	real x, y 
	escreva("O valor de A: ")
	leia(a)
	escreva("Digite o valor de B: ")
	leia(b)
	escreva("O valor de C: ")
	leia(c)
	escreva("O valor de D: ")
	leia(d)
	escreva("O valor de E: ")
	leia(E)	
	escreva("O valor de F: ")
	leia(f)

	x = ((c*E) - (b*f)) / ((a*E) - (b*d))
	y = ((a*f) - (c*d)) / ((a*E) - (b*d))

	escreva("O valor de X é: ", x, " e o valor de Y é: ", y)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
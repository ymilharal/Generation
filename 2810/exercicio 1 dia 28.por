programa
{
	
	funcao inicio()
	{//declaração de variaveis
	real pesoTomates, excesso, multa, zero

	escreva("Digite o peso dos tomates: ")
	leia(pesoTomates)

	//Se for maior que 50 deve pagar uma multa de 4

	se (pesoTomates > 50){
		excesso = pesoTomates - 50.00
		multa = excesso*4.00

		escreva("O excesso de peso é ", excesso, " e a multa será de R$ ", multa)
	}
	senao {
		excesso=  0
		multa= 0
		escreva("O excesso de peso é ", excesso, " e a multa será de R$ ", multa)
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
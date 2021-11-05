programa
{
	
	funcao inicio()
	{
		//conversão de idade 
		inteiro idade, anoNasc, meses,dias, idadeDias

		escreva("Qual o ano que você nasceu? ")
		leia(anoNasc)
		limpa()
		idade = 2021 - anoNasc
		
		escreva("Você tem ", idade, " anos ")
		escreva("\nQuantos meses faz desde que completou ", idade, " anos? ")
		leia(meses) 
		limpa()
		escreva("\nQuantos dias fazem desde que completou ", idade, " anos e ", meses, " meses?")
		leia(dias)
		limpa()

		idadeDias = (365 * idade) + (30 * meses) + dias
		escreva("Você tem ", idadeDias, " dias de vida, parabéns!")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
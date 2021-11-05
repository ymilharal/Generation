programa
{ 
//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.
	
	funcao inicio()
	{
	inteiro anos, dias, meses, idadeDias

	escreva("Quantos dias de vida você tem? ")
	leia(idadeDias)

	anos = idadeDias / 365
	meses = (idadeDias%365) / 30
	dias = (idadeDias%365) % 30

	escreva("\nVocê tem ", anos, " anos, ", meses, " meses ", " e ", dias, " dias de vida.")

	
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
	//Desenvolver um sistema que efetue a soma de todos os números ímpares que são
	//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

	inteiro impar, numero = 10, x, par

	inteiro soma = 0

		escreva("\n SOMA DOS NUMEROS IMPARES MULTIPLOS DE 3, DO 1 AO 500 ")
		
		para (x = 1; x <= 500; x++) 
		{ 
			se (x % 2 != 0 e x % 3 == 0)
			{
				soma += x
				}
		}

		escreva("\n É IGUAL A: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
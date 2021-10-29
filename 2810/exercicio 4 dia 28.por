programa
{ 
//4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
//número é par ou ímpar, e se é positivo ou negativo.
	
	funcao inicio()
	{
	inteiro numero, positivo
		escreva("Por favor digite um numero inteiro positivo ou negativo: ")
		leia(numero)

		positivo = numero % 2

		se (positivo == 0){
			escreva("O numero ", numero, " é par")
		}
		senao {
			escreva("O numero ", numero, " é impar")
		}
		se (numero >= 0){
			escreva(" e é positivo")
		}
		senao {
			escreva(" e é negativo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
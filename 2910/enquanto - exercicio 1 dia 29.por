programa
{
	
	funcao inicio()
	{
	//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	//apresente no final o total do somatório, a média e o total de valores lidos. O programa
	//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
	//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
	//negativo.
	//numSuc -- numeros Sucessivos
		inteiro numero, numSuc = 0, soma = 0, mediaNumeros = 0

		escreva("\n Digite um numero: ")
		leia(numero) 
		
		enquanto (numero >= 0) {
			limpa()
			numSuc++
			soma += numero
			mediaNumeros = soma / numSuc	
			
			escreva("\n Digite um numero: ")
		leia(numero)

		escreva("\n Digite um numero negativo se quiser sair: \n Digite um numero: ")
		leia(numero)
		}
		limpa()
		escreva("\n Soma total: ",soma,"\n Media dos Valores: ",mediaNumeros,"\n Total de Valores lidos: ",numSuc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 840; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
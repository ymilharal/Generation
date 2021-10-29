programa
{
//Receber valores de base e altura de um triângulo e verificar se são valores válidos
//(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	
	funcao inicio()
	{
	inteiro base, altura, area
		escreva("Digite o valor da base do triangulo: ")
		leia(base)
		
		escreva("Digite o valor da altura do triangulo: ")
		leia(altura)
		
		se (base >= 0 e altura >= 0){

		area = (base*altura) /2
		limpa()
		
		escreva("A área do triangulo com base ", base, " e altura ", altura, " será de ", area)
		}
		senao{
			escreva("Não são valores válidos")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
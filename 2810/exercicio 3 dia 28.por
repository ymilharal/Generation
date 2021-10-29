programa
{
		//declaração de variaveis 
		// numero1-n1 numero2-n2 numero3-n3 numero4-n4
		inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	real n1, n2, n3, n4, quadrado1, quadrado2, quadrado3, quadrado4
	
		escreva("Digite o primeiro número: ")
		leia(n1)
		quadrado1 = mat.potencia(n1, 2.0)

		escreva("\nDigite o segundo número: ")
		leia(n2)
		quadrado2 = mat.potencia(n2,2.0)

		escreva("\nDigite o terceiro número: ")
		leia(n3)
		quadrado3 = mat.potencia(n3, 2.0)

		escreva("\nDigite o quarto número: ")
		leia(n4)
		quadrado4 = mat.potencia(n4, 2.0)
		limpa()

		se (quadrado3 >= 1000){
			escreva("O resultado do quadrado do número ", n3, " é: ", quadrado3)
		}

		senao {
			escreva("O resultado do quadrado do número ", n1, " é: ", quadrado1)
			escreva("\nO resultado do quadrado do número ", n2, " é: ", quadrado2)
			escreva("\nO resultado do quadrado do número ", n3, " é: ", quadrado3)
			escreva("\nO resultado do quadrado do número ", n4, " é: ", quadrado4)
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
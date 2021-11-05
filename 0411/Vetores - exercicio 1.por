programa
{
	
	funcao inicio()
	{
		//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		real pontuacao[5] // Vetor com 4 posições
		real mp = 0.0 // ---> maior pontuação

		inteiro i // variavel para manipular o laço PARA

		escreva("Digite os 5 valores da pontuação da atividade: \n")
		para(i= 0; i <= 4; i++){
			escreva((i + 1), "º Pontuação: ")
			leia(pontuacao[i])	
		se (pontuacao[i] > mp){
		mp = pontuacao[i]
		}
		}
		limpa()
			escreva("A maior pontuação é: ", mp)
			
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
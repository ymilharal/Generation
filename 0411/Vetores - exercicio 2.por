programa{
	inclua biblioteca Util 
	
	funcao inicio(){
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/
		inteiro dado[10], mp = 0, totalMp = 0, lancamento = 10// -- vetor com 10 posições
		real media = 0.0, soma = 0.0

		inteiro i, ocorrencias = 0 //- variavel do laço PARA


		escreva("Sorteando valores")
		para (i = 0; i < lancamento; i++) {
			dado[i] = Util.sorteia (1, 6)
		}
		para (i = 0; i < lancamento; i++){
			soma = soma + dado[i]

			escreva("\nO lançamento ",(i+1), " foi de ", dado[i])
			se (dado[i] > mp){
				mp = dado[i]
				totalMp++
		}
		}
		media = soma / lancamento
		escreva("\nA média dos lançamentos foi de: ", media)
		escreva("\nO maior valor foi de: ", mp)
		escreva("\nE o maior valor apareceu: ", totalMp, "x")
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
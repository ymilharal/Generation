programa
{
	//porcentagem do distribuidor de 28% e os impostos de 45%,
     //escrever um sistema que leia o custo de fábrica de um carro e
     //escreva o custo ao consumidor.
	funcao inicio()
	{
	real custoFabrica, distribuidor, custoConsumidor, imposto

	escreva("Digite o valor de fabrica do veículo: ")
     leia(custoFabrica)
	//percentual sempre divide por 100
	distribuidor = custoFabrica + (custoFabrica*28/100)
	imposto = custoFabrica + (custoFabrica*45/100)
	custoConsumidor = custoFabrica + distribuidor + imposto

	escreva("O valor do veículo final será de: ", custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
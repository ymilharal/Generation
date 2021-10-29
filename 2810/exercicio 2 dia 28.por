programa
{
	//Declaração de variaveis
	//c -codigo n- numero de horas e-excesso salarioTotal salarioExcesso
	//salario 10-1hora hora de excesso-20
	//exceder 50 calcule o excesso
	funcao inicio()
	{
	real C, N, E, salarioTotal, salarioExcesso

	escreva("Digite aqui o codigo do funcionario: ")
	leia(C)

	escreva("Digite o número de horas trabalhadas pelo funcionario: ")
	leia(N)

	se ( N > 50 ){
		E= N - 50
		salarioTotal= N*10
		salarioExcesso= E*20 
		escreva("O tempo excedido é de ", E, " horas.")
		escreva("\nO salario total será de: R$", salarioTotal, " e o Extra será de: R$", salarioExcesso)
	}
	senao{
		E= 0.0
		salarioTotal= N*10
		salarioExcesso= 0.0
		escreva("O tempo excedido é de ", E, " horas.")
		escreva("\nO salario total será de: R$", salarioTotal, " e o Extra será de: R$", salarioExcesso)
	} 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 666; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
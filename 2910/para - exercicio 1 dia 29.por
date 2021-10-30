programa
{
//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
//média do salário da população; média do número de filhos; maior salário; percentual de pessoas com salário até R$100,00.
	funcao inicio(){
	//Laços de repetição - Para
	
	real mediaSalario, mediaFilhos,salario = 0.0, maiorsal = 0.0, receberMenos = 0.0, totalSalario = 0.0, totalFilhos = 0.0, percentual = 0.0
	inteiro filhos, habitantes = 20, x

	para(x = 1; x<= habitantes; x++){
	escreva("Digite o salario aqui: ")
	leia(salario)

	escreva("Digite a quantidade de filhos: ")
	leia(filhos)

	totalSalario = totalSalario + salario
	totalFilhos = totalFilhos + filhos

	se(salario > maiorsal){
	maiorsal = salario	
		}
	se(salario <=100){
	receberMenos++
	}
	}
	mediaSalario = totalSalario / habitantes
	mediaFilhos = totalFilhos / habitantes

	percentual = (receberMenos*100) / habitantes

	escreva("\nMédia Salarial dos Habitantes: ", mediaSalario)
	escreva("\nMédia de Filhos dos Habitantes: ", mediaFilhos)
	escreva("\nMaior salário: ", maiorsal)
	escreva("\nPorcentagem de Habitantes até R$ 100.00: ", percentual, "%")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
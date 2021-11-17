package Exercicio01Herança;

public class AnimalTeste {

	public static void main (String[] args) {
		
		var flora = new Cachorro();
		var florir = new Cavalo();
		var floriu = new Preguiça();
		
		flora.setRaça("Buldogue Frances");
		flora.setIdade(7);
		flora.setEstimativaVida(14);
		flora.setLate("Latido.");
		flora.setAlimentacao("rações small breed");
		
		System.out.println("===Guia de animais===\n");
		System.out.println("Cachorro: " + flora.getRaça() + " está com " + flora.getIdade() + " anos e vive em média " + flora.getEstimativaVida() +
				" anos sua alimentação é de " + flora.getAlimentacao() + " o som que emite \ncostuma ser um " + flora.getLate());
		
		florir.setRaça("Frísio");
		florir.setIdade(15);
		florir.setEstimativaVida(40);
		florir.setRelincha("Relinchar");
		florir.setCorrida("e é um cavalo de corrida.");
		florir.setAlimentacao("com nutrientes");
		
		System.out.println("\nCavalo: " + florir.getRaça() + " está com " + florir.getIdade() + " anos e vive em média " + florir.getEstimativaVida() +
				" anos sua alimentação é " + florir.getAlimentacao() + ", o som que emite costuma ser um " + florir.getRelincha() + florir.getCorrida());
		
		floriu.setRaça("Preguiça-comum (Bradypus variegatus)");
		floriu.setIdade(25);
		floriu.setEstimativaVida(50);
		floriu.setCamufla("Pelagem que se camufla no ambiente");
		floriu.setLentidão("lento");
		floriu.setAlimentacao("folhas e frutos");
		
		System.out.println("\nPreguiça: " + floriu.getRaça() + " está com " + floriu.getIdade() + " anos e vive em media " + floriu.getEstimativaVida() +
				" anos sua alimentação é composta de " + floriu.getAlimentacao() + ",\n é caracterisco ele ser um animal " + floriu.getLentidão());
		
		System.out.println("\n===Fechou Guia de animais===");	
	}
}

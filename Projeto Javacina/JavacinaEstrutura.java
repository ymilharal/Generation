package JavacinaProjeto;

public class JavacinaEstrutura  {
		
		protected static int idade;
		protected static int doses;
		protected static int comorbidade;
		protected static String postos[] = new String[] {"Posto Santa Luzia", "Posto Abraham Lincoln", "Posto Burgo Paulista",
				"Posto Centro"};
		protected static String vacinas[] = new String[] {"Coronavac", "Astrazeneca", "Janssen", "Pfizer"};
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getDoses() {
			return doses;
		}
		public void setDoses(int doses) {
			this.doses = doses;
		}
		public int getComorbidade() {
			return comorbidade;
		}
		public void setComorbidade(int comorbidade) {
			this.comorbidade = comorbidade;
		}
		public String[] getPostos() {
			return postos;
		}
		public void setPostosLocal(String[] postos) {
			this.postos = postos;
		}
		public String[] getVacinas() {
			return vacinas;
		}
		public void setVacinas(String[] vacinas) {
			this.vacinas = vacinas;
		}
		public JavacinaEstrutura(int idade, int doses, int comorbidade, String[] postos, String[] vacinas) {
			super();
			this.idade = idade;
			this.doses = doses;
			this.comorbidade = comorbidade;
			this.postos = postos;
			this.vacinas = vacinas;
		}
		
}
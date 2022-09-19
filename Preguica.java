package POO;

public class Preguica extends Animal {
	
		private String deslocamento;
		
		public Preguica (String nome, int idade, String origem, String som, String deslocamento) {
			
			super(nome, idade, origem, som);
			this.deslocamento = deslocamento;
		}

		public String getDeslocamento() {
			return deslocamento;
		}


		public void setDeslocamento(String deslocamento) {
			this.deslocamento = deslocamento;
		}
		
		
		public void imprimirPre() {
			System.out.println("\nNome do animal: " + getNome() + "\nIdade: " + getIdade() + "\nOrigem do animal: " + getOrigem() +
			"\nEmite som?: " + getSom() + "\nDeslocamento: " + deslocamento);
		}
		
		
		
		
		
		
		
		
			
		
		
		

	}
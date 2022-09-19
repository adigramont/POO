package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Hades", 13, "Criadoro da Vó Malu", "Sim", "Anda e corre", "Bull Terrie");
		Cavalo horse = new Cavalo ("Black", 23, "Fazenda do Zé Leôncio", "Sim", "Cavalga", "Cavalo Pantaneiro");	
		Preguica sloth = new Preguica("Cammy", 5, "Pantanal", "Sim", "Sobe árvores");
		
	System.out.println("\t\t\tInformações dos animais: ");
	dog.imprimirCa();
	horse.imprimirCav();
	sloth.imprimirPre();


	}
}

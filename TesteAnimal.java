package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Hades", 13, "Criadoro da V� Malu", "Sim", "Anda e corre", "Bull Terrie");
		Cavalo horse = new Cavalo ("Black", 23, "Fazenda do Z� Le�ncio", "Sim", "Cavalga", "Cavalo Pantaneiro");	
		Preguica sloth = new Preguica("Cammy", 5, "Pantanal", "Sim", "Sobe �rvores");
		
	System.out.println("\t\t\tInforma��es dos animais: ");
	dog.imprimirCa();
	horse.imprimirCav();
	sloth.imprimirPre();


	}
}

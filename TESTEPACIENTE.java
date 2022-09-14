package TESTE;

public class TESTEPACIENTE {

	public static void main(String[] args) {
		
		PACIENTE pessoa1 = new PACIENTE ("Rogério das Couves",55,"bronquite asmatica","masculino");
		PACIENTE pessoa2 = new PACIENTE ("Roberta Viera",34,"cefaleia","feminino");
		
		
		System.out.println("\n****Hospital Santa Rita****");
		pessoa1.imprimirInfo();
		System.out.println("\n");
		pessoa2.imprimirInfo();
		

	}

}

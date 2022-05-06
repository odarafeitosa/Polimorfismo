package arvoreanimal;

public class AppVetorDeAnimais {
	public static void main(String[] args) {
		Homem h1 = new Homem();
		Homem h2 = new Homem();
		Homem h3 = new Homem();
		Cao c1 = new Cao();
		Cao c2 = new Cao();
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		Gato g3 = new Gato();
		Gato g4 = new Gato();
		
		VetorAnimaisComPolimorfismo vetor = new VetorAnimaisComPolimorfismo();
		
		vetor.add(g4);
		vetor.add(c2);
		vetor.add(h2);
		
		VetorAnimaisSemPolimorfismo vetorBurro = new VetorAnimaisSemPolimorfismo();
		vetorBurro.addCao(c2);
		vetorBurro.addGato(g4);
		vetorBurro.addHomem(h3);

	}

}

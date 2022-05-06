package arvoreanimal;

public class VetorAnimaisComPolimorfismo {
	
	private Animal [] animais = new Animal[200];
	private int nextIndex = 0;
	
	public void add(Animal a) {
		if(nextIndex<animais.length) {
			animais[nextIndex] = a;
			nextIndex++;
			System.out.println(a.falar());
			System.out.println(a.mover());
		}
	}

}

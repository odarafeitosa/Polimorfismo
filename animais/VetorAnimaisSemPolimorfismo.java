package arvoreanimal;

public class VetorAnimaisSemPolimorfismo {
	private Cao [] caes = new Cao[200];
	private Gato [] gatos = new Gato[200];
	private Homem [] homens = new Homem[200];
	
	private int nextIndexCao = 0;
	private int nextIndexGato = 0;
	private int nextIndexHomem = 0;
	
	public void addCao(Cao c) {
		if(nextIndexCao<caes.length) {
			caes[nextIndexCao] = c;
			nextIndexCao++;
			System.out.println(c.falar());
			System.out.println(c.mover());
		}
	}
	
	public void addGato(Gato g) {
		if(nextIndexGato<gatos.length) {
			gatos[nextIndexGato] = g;
			nextIndexGato++;
			System.out.println(g.falar());
			System.out.println(g.mover());
		}
	}
	
	public void addHomem(Homem h) {
		if(nextIndexHomem<homens.length) {
			homens[nextIndexHomem] = h;
			nextIndexHomem++;
			System.out.println(h.falar());
			System.out.println(h.mover());
		}
	}

}

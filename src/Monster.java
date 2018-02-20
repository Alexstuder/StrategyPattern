import Interfaces.Angreifen;

public abstract class Monster {
	
	Angreifen angreifen;
	
	public void laufen() {
		System.out.println("Ich laufe....");
	}
	public void schwimmen() {
		System.out.println("Ich schwimme....");
	}
	
	public void angreifen() {
		angreifen.angreifen();		
	}

}

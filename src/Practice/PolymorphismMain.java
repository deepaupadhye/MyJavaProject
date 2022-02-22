package Practice;

public class PolymorphismMain {

	public static void main(String[] args) {
		Polymorphism poly=new Polymorphism();
		dog d=new dog();
		cat c=new cat();
		poly.animalSound();
		d.animalSound();
		c.animalSound();

	}

}

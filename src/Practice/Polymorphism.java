package Practice;

public class Polymorphism {
	public void animalSound() {
    System.out.println("The animal makes a sound");
	}
}

class dog extends Polymorphism{
	public void animalSound() {
    System.out.println("bow bow");
}
}
class cat extends Polymorphism{
	public void animalSound()
	{
    System.out.println("meow meow");
}
}
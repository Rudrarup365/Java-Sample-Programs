package testing;

class NewAnimal { // Superclass (parent)
	  public NewAnimal() {
	    System.out.println("The animal makes a sound");
	  }
	}

class NewDog extends NewAnimal { // Subclass (child)
	  public NewDog() {
	    super(); // Call the superclass method
	    System.out.println("The dog says: bow wow");
	  }
	}


public class SuperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewAnimal myDog = new NewDog(); // Create a Dog object
	    //myDog.animalSound(); // Call the method on the Dog object
	}

}

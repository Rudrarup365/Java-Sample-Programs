package testing;

public class CallAnimal {
	    public static void main(String[] args) {
	        Animal myAnimal = new Dog(); // Polymorphic assignment
	        myAnimal.makeSound(); // Calls Dog's makeSound() method at runtime
	    }

}

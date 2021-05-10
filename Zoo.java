package InterfaceConcept;

public class Zoo implements Animals {

	public static void main(String[] args) {

	}
	// eat and sleep methods are implemented because of interface
	public void eat() {
		System.out.println("Eating ...");
	}

	public void sleep() {
		System.out.println("Sleeping ...");
	}

	// talk and sit methods are defined in Zoo class
	public void talk() {
		System.out.println("Talking ...");
	}

	public void drink() {
		System.out.println("Drinking ...");
	}
	public void sit() {
		System.out.println("Sitting ...");
	}
	public void jump() {
		System.out.println("Jumping ...");
	}

}

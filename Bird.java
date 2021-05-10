package InterfaceConcept;

public class Bird extends Zoo {

	public static void main(String[] args) {
		
		Zoo bird1 = new Zoo(); //creating object of zoo class .. Instantiating zoo class
		System.out.println("*** Bird1 inheriting methods only from Zoo class");
		bird1.drink();
		bird1.sit();
		
		Animals bird2 = new Bird(); // Polymorphism .. This bird2 does not have access to local fly method. 
		System.out.println("*** Polymorphism .. Bird2 inheriting from Animals interface ***");
		bird2.sleep();				// It can only inherit methods mentioned in Animals interface.
		bird2.eat();
		
		Zoo bird3 = new Bird();		// Polymorphism .. This bird2 does not have access to local fly method.
		System.out.println("*** Polymorphism .. Bird3 inheriting from Zoo class ***");
		bird3.drink();
		bird3.sit();
		bird3.talk();
		
		System.out.println("*** local static methods ***");
		fly(); 			//calling local static method. This method is not available to parent.
		jumpAnimals(bird3);
	}
	public static void fly() {
		System.out.println("Flying ...");
	}
	
	public static void jumpAnimals (Zoo anAnimal) {		//Zoo is variable type. anAnimal is variable name. Could be any name.
		anAnimal.jump();							// jump method is being called from Zoo class
	}
	
}

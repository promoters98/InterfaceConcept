package InterfaceConcept;

public class Horse extends Zoo {

	public static void main(String[] args) {
		
		Zoo horse1 = new Zoo();			// creating object/instantiating Zoo class
		System.out.println("*** Horse class ***");
		horse1.drink();
		horse1.eat();
		horse1.talk();
		horse1.sleep();
	}

}

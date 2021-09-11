
public class Main {

	public static void main(String[] args) {
		Animal obj = new Cat();
		System.out.println("The obj object of Animal Class is used. Instantiated with reference of class Cat");
		obj.sound();
		
		obj = new Dog();
		System.out.println("The obj object of Animal Class is used. Instantiated with reference of class Dog");
		obj.sound();

	}

}

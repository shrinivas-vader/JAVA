package example;

public class Animal {

	String name;
	void eat() {
		System.out.println(name+" is eating");
	}
	
	void sleep() {
		System.out.println(name+" is sleeping");
	}
	public static void main(String[] args) {

		Dog d = new Dog();
		
		d.name = "Brownie";
//		d.sleep();
//		d.eat();
		d.name = "Julie";
//		d.eat();
		d.bark();
		d.run();
	}

}

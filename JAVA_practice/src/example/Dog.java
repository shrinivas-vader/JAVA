package example;

public class Dog implements AnimalFeatures{

	String name;
	void bark() {
		
		System.out.println(name+" dog is barking");
	}
	
	@Override
	public void run() {
		System.out.println(name+" is running");
	}
	
	public void jump() {
		System.out.println(name+" is jumping");
	}
}

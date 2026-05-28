package animalLooselyCoupledPackage;

public class Dog implements Animal {

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("This is dog eating");
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("This is dog running");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("This is dog sleeping");
	}

}

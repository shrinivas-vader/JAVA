package example;

public class Singleton{
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance(){
		if(instance == null) {
			instance = new Singleton();
		}
			return instance;		
	}
}


//class Singleton{
//	private Singleton instance;
//	
//	private Singlton() {}
//	
//	public Singleton getInstance() {
//		if(instance==null) {
//			instance = new Singleton();;
//		}
//		return instance;
//	}
//}
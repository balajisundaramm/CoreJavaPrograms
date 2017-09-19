public class Person{
	int age;
	String name;

	public void eat(int age) {
		if(age>=40)
			System.out.println("I am "+name+" eating more");
		else
			System.out.println("I am "+name+" eating less");

	}
	public void sleep(int age) {
		if(age>=40)
			System.out.println("I am "+name+" sleeping less");
		else
			System.out.println("I am "+name+" sleeping more");
		
	}
}
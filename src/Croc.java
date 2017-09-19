public class Croc{
	String name;
	public void eat(Fish f) {
		System.out.println("Croc name is "+name+" Fish name is "+f.name);
		System.out.println("I am a croc with name "+name+" eating the fish "+f.name);
		f=null;
		f=new Fish();
		f.name="flippy";
		System.out.println("I am a croc with name "+name+" eating the fish "+f.name);

	}
}
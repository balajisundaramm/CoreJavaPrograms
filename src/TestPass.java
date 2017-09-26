public class TestPass{

	public static void main(String[] args) {
		Fish f=new Fish();
		Croc c=new Croc();
		f.name="fishy";
		c.name="crocy";
		System.out.println("Before calling eat fish name is "+f.name);
		c.eat(f);
		System.out.println("After calling eat fish name is "+f.name);
		c.eat=null;


	}
}
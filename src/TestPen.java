public class TestPen{
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.setName("Parker");
		p1.setInkQty(3);
		p1.color="Black";
		p1.write();
		p1.write();
		p1.write();
		p1.write();

		p1.refill(2);
		p1.write();
		p1.write();
		p1.write();


	}
}
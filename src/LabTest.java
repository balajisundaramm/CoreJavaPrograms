public class LabTest{
	public static void main(String[] args) {
	int x=10;
	System.out.println("before invoking "+x);	
	LabTest.process(x)
	System.out.println("after invoking "+x);
	}
	public static int process(int a) {
		System.out.println(a);
		a=20;
		System.out.println("In process "+a);
		
	}
}

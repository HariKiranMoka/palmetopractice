class b
{
	int z;
	b(int x)
	{
		z=x;
		System.out.println(x);
	}
}
public class C extends b {
	C()
	{
	super(10);
	}
	public static void main(String[] args) {
		
		new C();
		
		

	}

}

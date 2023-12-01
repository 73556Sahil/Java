
public class A 
{
	private int a;
	private String str;
	
	
	public A() {
		System.out.println("Inside default Constructor of Parent class A :");
	}
	
	
	
	public A(int a, String str) {
		super();
		this.a = a;
		this.str = str;
	}
	public
	
	
	int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	
	
	@Override
	public String toString() {
		return "A [a=" + a + ", str=" + str + "]";
	}
	
	
}

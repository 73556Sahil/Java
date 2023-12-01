

public class SingleInheritance extends A 
{
	private int b;
	private String str1;
	
	
	public SingleInheritance() 
	{
		super();
		System.out.println("Inside default constructor of Child Class SingleInheritance : ");
	}
	
	
	public SingleInheritance(int b, String str1) {
		super();
		this.b = b;
		this.str1 = str1;
	}
	
	
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	
	
	
	@Override
	public String toString() {
		return "SingleInheritance [b=" + b + ", str1=" + str1 + "]";
	}
	
	
}

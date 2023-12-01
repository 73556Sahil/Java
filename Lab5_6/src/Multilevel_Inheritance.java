
public class Multilevel_Inheritance extends Q
{
	private int m;
	private String mstr;
	
	
	public Multilevel_Inheritance() 
	{
		super();
		System.out.println("Inside default of Multilevel_Inheritance (child of Q) : ");
	}
	
	
	
	public Multilevel_Inheritance(int m, String mstr) {
		super();
		this.m = m;
		this.mstr = mstr;
	}
	
	
	
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public String getMstr() {
		return mstr;
	}
	public void setMstr(String mstr) {
		this.mstr = mstr;
	}
	
	
	
	@Override
	public String toString() {
		return "Multilevel_Inheritance [m=" + m + ", mstr=" + mstr + "]";
	}
	
	
}

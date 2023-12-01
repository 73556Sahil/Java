
public class P 
{
	private int p1;
	private String pstr;
	
	
	public P() {
		System.out.println("Inside default of Parent Class P : ");
	}
	
	
	public P(int p1, String pstr) {
		super();
		this.p1 = p1;
		this.pstr = pstr;
	}
	
	
	
	public int getP1() {
		return p1;
	}
	public void setP1(int p1) {
		this.p1 = p1;
	}
	public String getPstr() {
		return pstr;
	}
	public void setPstr(String pstr) {
		this.pstr = pstr;
	}
	
	
	
	@Override
	public String toString() {
		return "P [p1=" + p1 + ", pstr=" + pstr + "]";
	}
	
	
}

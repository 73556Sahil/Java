
public class Q extends P
{
	private int q;
	private String qstr;
	
	
	
	public Q() {
		super();
		System.out.println("Inside defalut of Q (child of P) : ");
	}
	
	
	public Q(int q, String qstr) {
		super();
		this.q = q;
		this.qstr = qstr;
	}
	
	
	
	public int getQ() {
		return q;
	}
	public void setQ(int q) {
		this.q = q;
	}
	public String getQstr() {
		return qstr;
	}
	public void setQstr(String qstr) {
		this.qstr = qstr;
	}
	
	
	
	@Override
	public String toString() {
		return "Q [q=" + q + ", qstr=" + qstr + "]";
	}
	
	
}


public class WageEmployee extends Employee
{
	private int wid;
	private String wname;
	private String wmail;
	
	
	public WageEmployee() {
		super();
	}
	
	
	public WageEmployee(int wid, String wname, String wmail) {
		super();
		this.wid = wid;
		this.wname = wname;
		this.wmail = wmail;
	}
	
	
	
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getWmail() {
		return wmail;
	}
	public void setWmail(String wmail) {
		this.wmail = wmail;
	}
	
	public void displayData()
	{
		Employee e = new Employee();
		e.displayData();
		System.out.println("WageEmployee id = "+wid+"\nWageEmployee Name = "+wname+"\nWageEmployee Email-ID = "+wmail);
	}
	
	
	@Override
	public String toString() {
		return "WageEmployee [wid=" + wid + ", wname=" + wname + ", wmail=" + wmail + "]";
	}
	
	
}

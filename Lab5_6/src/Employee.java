
public class Employee 
{
	private int eid;
	private String ename;
	private String email;
	
	
	
	public Employee() {
		eid=2;
		ename="Prathamesh Nale";
		email="prathameshnale@gmail.com";
	}
	
	
	public Employee(int eid, String ename, String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
	}
	
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void displayData()
	{
		System.out.println("Employee id = "+eid+"\nEmployee Name = "+ename+"\nEmployee Email-ID = "+email);
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + "]";
	}
}

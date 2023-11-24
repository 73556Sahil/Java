
public class Employee 
{
	private int id;
	private String name;
	private String emailID;
	
	
	public Employee() {
		super();
	}


	
	public Employee(int id, String name, String emailID) {
		super();
		this.id = id;
		this.name = name;
		this.emailID = emailID;
	}


	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailID=" + emailID + "]";
	}
	
	
	
}

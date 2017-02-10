import java.io.Serializable;

public class Employee extends ParentEmployee  {
	
	transient int id;
	 static private String name; 
	public int getVersioner() {
		return versioner;
	}

	final int versioner=2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Employee( int id,String name) {
		super();
		this.name =name;
		this.id = id;
	}

	

}

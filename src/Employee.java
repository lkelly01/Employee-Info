public class Employee {
	//fields
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	//constructors	//arg
	 public Employee(String name,int idNumber,String department,String position) {
		//Assigns
		 this.name=name;
		this.idNumber=idNumber;
		this.position=position;
		this.department=department;
	}
	public Employee(String name,int idNumber) {
		this.idNumber= idNumber;
		this.name=name;
		this.position = " ";
		this.department = " ";
		
	}
	//No arg
	public Employee() {
		this.department="";
		this.idNumber=0;
		this.name="";
		this.position="";
		
	}

	public static void main(String[] args) {
	//3 objects
	Employee e = new Employee("Susan Meyers ", 47899, " Accounting ", "Vice President ");
	Employee e1 = new Employee("Mark Jones ", 39119, " IT ", "Programmer ");
	Employee e2 = new Employee("Joy Rogers ", 81774, " Manufacturing ","Egineer ");
		
	//print grab	
	System.out.println(e.getName() +e.getIdNumber() +e.getDepartment( ) +e.getPosition());
   
	System.out.println(e1.getName() +e1.getIdNumber() +e1.getDepartment() +e1.getPosition());
    
	System.out.println(e2.getName() +e2.getIdNumber() +e2.getDepartment() +e2.getPosition());


	}
	
	//Mutator, Accessor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}

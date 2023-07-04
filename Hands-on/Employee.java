package oops;
class Employee
{
	 private String name;
	 private int age;
	 private String address;
	 private int E_Id;
	 private int joiningdate;
	private String position;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getE_Id() {
		return E_Id;
	}
	public void setE_Id(int e_Id) {
		E_Id = e_Id;
	}
	public int getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(int joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	 
}
 class Employee_main
{

		public static void main(String[] args)
		{
			//Creating instance of class Employee
			Employee e=new Employee();
			
			//setting values
			e.setName("Aishu");
			e.setAge(23);
			e.setAddress(" XYZ");
			e.setE_Id(1);
			e.setJoiningdate(2013);
			e.setPosition(" Associate ");
			
			//print values
			System.out.println("Name is:" + e.getName());
			System.out.println("Age is:" + e.getAge());
			System.out.println("Address is:" + e.getAddress());
			System.out.println("Employee id is:" + e.getE_Id());
			System.out.println("Joining date is:"+ e.getJoiningdate());
			System.out.println("Position of the employee is:" + e.getPosition());
		}

	}



package oops;
class Students
{
	 private String name;
	 private int age;
	 private String address;
	 private int rollno;
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	 
}
 class Student_main
{

		public static void main(String[] args)
		{
			//Creating instance of class Encapsulation
			Students e=new Students();
			
			//setting values
			e.setName("Aishu");
			e.setAge(23);
			e.setAddress(" XYZ");
			e.setRollno(1);
			
			//print values
			System.out.println("Name is:" + e.getName());
			System.out.println("Age is:" + e.getAge());
			System.out.println("Address is:" + e.getAddress());
			System.out.println("Roll number is:" + e.getRollno());
			
		}

	}



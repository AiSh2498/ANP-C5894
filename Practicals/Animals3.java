package oops;

abstract class Animals3
{
//Abstract method does not have body 
	public abstract void sound();
	
	//can contain non abstract method
	public void sleep()
	{
		System.out.println("Animals Sleep....");
	}
}
//subclass inherits Animals3
class Monkey extends Animals3
{
public void sound()
{
System.out.println("Monkey sounds like human....");	
}
}
class Animals3main
{
	public static void main(String[]args)
	{
		Monkey m=new Monkey();
		m.sound();
		m.sleep();
	}
}
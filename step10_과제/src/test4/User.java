package test4;

public class User{
	private String name;
	private int age;
	private double tall;
	
	public User() {
		super();
	}
	public User(String name, int age, double tall) {
		super();
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	@Override
	public String toString() {
		return "이름 : " + name +"\t나이 : " + age +"\t키 : "+tall +"\n";
	}	
}

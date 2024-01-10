package jackson;

public class Student {
	
	private String name;
	private String age;
	private int marks;
	
	
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	
}

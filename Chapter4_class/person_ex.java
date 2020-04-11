
public class person_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		Person person2 = new Person("Ȧ�浿", 10);
		
		System.out.println(person);
		System.out.println(person2);

	}

}

class Person {
	private String name;
	private int age;
	
	Person(){
		
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
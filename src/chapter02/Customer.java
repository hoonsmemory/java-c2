

package chapter02;

public class Customer {
	protected String name; // protected (상속, 같은 패키지)
	private int age; //private은 외부에서 접근 X
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

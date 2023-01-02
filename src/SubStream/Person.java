package SubStream;

import java.io.Serializable;

public class Person implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 클래스의 구성 필드가 조금 다르더라도 직렬화 - 역직렬화 가능하도록 하는 필드 
	private String name;
	private int age;
	private boolean isPassed;
	
	public Person(String name,int age,boolean ispassed)
	{
		this.name = name;
		this.age = age;
		this.isPassed = ispassed;
	}

	
	
	@Override
	public String toString() {
		return "Person [이름=" + name + ", 나이=" + age + ", 합격하였는가?=" + isPassed + "]";
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

	public boolean isPassed() {
		return isPassed;
	}

	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}
	
	
}

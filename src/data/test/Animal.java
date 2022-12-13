package data.test;

public class Animal {
	
	private String animal_name;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String animal) {
		// TODO Auto-generated constructor stub
		
		animal_name = animal;
	}
	
	public void setInnerData(String animal_) {
		this.animal_name = animal_;
	}
	
	public String getInnerData() {
		return animal_name;
	}
	
}

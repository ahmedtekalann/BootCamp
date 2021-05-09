package b_oopIntro.a_lecture;

public class Category {
	private int id;
	private String name;
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}

	//constructor'la da yapabiliriz.
	
	
	public int getId() { // esitligin sol tarafi
		return this.id;
	}
	
	public void setId(int id) { //esitligin sag tarafi
		this.id=id;
	}
	
	public String getName() {
		return this.name+"!";
	}
	
	public void setName(String name) {
		this.name=name;
	}
}

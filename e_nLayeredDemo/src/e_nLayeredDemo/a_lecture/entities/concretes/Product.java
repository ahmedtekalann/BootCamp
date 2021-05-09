package e_nLayeredDemo.a_lecture.entities.concretes;

import e_nLayeredDemo.a_lecture.entities.abstracts.Entity;

public class Product implements Entity { // sen bir entity'sin. ciplak class kalmamali. Ilerde sikinti yasamamak icin. Concrete sinifa sinirlandirma getirmek zorunda kalacagiz. Bu durumda sikinti yasamamak icin.
	
	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	private int unitsInStock;

	public Product() {
	}

	public Product(int id, int categoryId, String name, double unitPrice, int unitsInStock) {
		
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}

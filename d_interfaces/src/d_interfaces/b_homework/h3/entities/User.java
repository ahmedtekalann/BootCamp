package d_interfaces.b_homework.h3.entities;

import java.util.Date;

public class User {

	private int userId;
	private String firstName, lastName, natioanalityId;
	private Date dateOfBirth;

	public User() {

	}

	public User(int id, String firstName, String lastName, String natioanalityId, Date dateOfBirth) {

		super();
		this.userId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.natioanalityId = natioanalityId;
		this.dateOfBirth = dateOfBirth;

	}

	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String fullName) {
		this.lastName = fullName;
	}

	public String getNatioanalityId() {
		return natioanalityId;
	}

	public void setNatioanalityId(String natioanalityId) {
		this.natioanalityId = natioanalityId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}

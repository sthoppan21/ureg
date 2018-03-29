package com.example.registration.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "regtab")
@Access(value=AccessType.FIELD)
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    //private static final long serialVersionUID = -3009157732242241606L;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private long id;
	/*


	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	protected User() {
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public User(int id, String firstName, String lastName) {
	    this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {

		return String.format("User[id='%', firstName='%s', lastName='%s']", id, firstName, lastName);
	}                                                                                        */

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "middlename")
	private String middlename;

	@Column(name = "surname")
	private String surname;

	@Column(name = "age")
	private int age;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "address1")
	private String Address1;

	@Column(name = "address2")
	private String Address2;

	@Column(name = "state")
	private String State;

	@Column(name = "pincode")
	private int Pincode;

	@Column(name = "email")
	private String email;


	@Column(name = "mobilenumber")
	private int mobilenumber;


protected User()
{}

	public int getId() {
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getmiddlename() {
		return middlename;
	}

	public void setmiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		this.Address1 = address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		this.Address2 = address2;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		this.State = state;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		this.Pincode = pincode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {

			return String.format("User[id='%', firstname='%s', middlename='%s', surname='%s'," +
							", age='%', dob='%', Address1='%s', Address2='%s'" +
							", State='%s', Pincode='%', email='%s', mobilenumber='%']"
					, id, firstname, middlename, surname, age, dob, Address1, Address2, State, Pincode, email, mobilenumber);
	}
	public User(int id, String firstname, String middlename, String Surname, int age, Date dob, String Address1, String Address2 ,
						String State, int Pincode, String email , int mobilenumber) {
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.surname = Surname;
		this.age = age;
		this.dob = dob;
		this.Address1 = Address1;
		this.Address2 = Address2;
		this.State = State;
		this.Pincode = Pincode;
		this.email = email;
		this.mobilenumber = mobilenumber;
	}
}
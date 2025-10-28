package com.codegnan.mapinterface;

import java.util.Objects;

public class Person {
int id;
String name;
String email;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public int hashCode() {
	return Objects.hash(email, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
}

}






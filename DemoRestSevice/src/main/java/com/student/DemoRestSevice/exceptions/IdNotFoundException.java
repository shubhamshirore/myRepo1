package com.student.DemoRestSevice.exceptions;

public class IdNotFoundException extends Exception{
int id;

public IdNotFoundException(int id) {
	super();
	this.id = id;
}

public String getException() {
	// TODO Auto-generated method stub
	return "ID : "+id+" not fonund in database";
}

}

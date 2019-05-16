package com.student.model;

public class StudentModel {
private int id;//唯一id
private String username;//用户名
private String password;//密码
private int sex;//性别
private String love;//爱好

public StudentModel(int id,String password,int sex,String love){
	super();
	this.id = id;
	this.password = password;
	this.username  = username;
	this.sex = sex;
	this.love =love;
}

}

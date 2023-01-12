package Serialize;

import java.io.Serializable;

public class Demo implements Serializable{
String name;
int age;
transient int id;
Demo(String n,int a,int id){
	this.name=n;
	this.age=a;
	this.id=id;
}
}

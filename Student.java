package Pojo.entity;



import java.util.LinkedList;
import java.util.List;

import Pojo.enums.Branch;

public class Student {

	String rollNum;
	String name;
	Branch branch;
	Integer rank;
	Integer age;
	
	public Student(String rollNum,String name,int rank,int age,Branch branch) {
		this.rollNum=rollNum;
		this.name=name;
		this.rank=rank;
		this.age=age;
		this.branch=branch;
	}

	public Student() {
		
	}
	static List<Student> slist=new LinkedList<>();
	public String getRollNum() {
		return rollNum;
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", branch=" + branch + ", rank=" + rank + ", age="
				+ age + "]";
	}

	
     }
	 
	

	
	


	
	
	
	



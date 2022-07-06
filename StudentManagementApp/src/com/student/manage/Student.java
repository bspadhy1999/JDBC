package com.student.manage;

public class Student {
	private int studentid;
	private String studentname;
	private String studentcity;
	private String studentphone;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	public String getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(String studentphone) {
		this.studentphone = studentphone;
	}
	public Student(int studentid, String studentname, String studentcity, String studentphone) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentcity = studentcity;
		this.studentphone = studentphone;
	}
	public Student(String studentname, String studentcity, String studentphone) {
		super();
		this.studentname = studentname;
		this.studentcity = studentcity;
		this.studentphone = studentphone;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentcity=" + studentcity
				+ ", studentphone=" + studentphone + "]";
	}

}

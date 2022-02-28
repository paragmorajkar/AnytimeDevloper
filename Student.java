package CRUDOparetion;

import java.sql.Date;

public class Student {
	private int student_no;
	private String StudentName;
	private Date Student_DOB;
	private Date Student_DOJ;
	public Student(int student_no, String studentName, Date student_DOB, Date student_DOJ) {
		super();
		this.student_no = student_no;
		StudentName = studentName;
		Student_DOB = student_DOB;
		Student_DOJ = student_DOJ;
	}
	public Student(String studentName, Date dob, Date doj) {
		super();
		StudentName = studentName;
		Student_DOB = dob;
		Student_DOJ = doj;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudent_no() {
		return student_no;
	}
	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Date getStudent_DOB() {
		return Student_DOB;
	}
	public void setStudent_DOB(Date student_DOB) {
		Student_DOB = student_DOB;
	}
	public Date getStudent_DOJ() {
		return Student_DOJ;
	}
	public void setStudent_DOJ(Date student_DOJ) {
		Student_DOJ = student_DOJ;
	}
	@Override
	public String toString() {
		return "Student [student_no=" + student_no + ", StudentName=" + StudentName + ", Student_DOB=" + Student_DOB
				+ ", Student_DOJ=" + Student_DOJ + "]";
	}

}

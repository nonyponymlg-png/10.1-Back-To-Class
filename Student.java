public class Student extends Person{ 
	protected String myIdNum; // Student Id Number 
	protected double myGPA; // grade point average 
	// constructor 
	public Student(String name, int age, String gender, String idNum, double gpa){ 
		// use the super class' constructor 
		super(name, age, gender); 
		// initialize what's new to Student 
		myIdNum = idNum; 
		myGPA = gpa; 
	} 
	public String getIdNum(){ 
		return myIdNum; 
	} 
	public double getGPA(){ 
		return myGPA; 
	} 
	public void setIdNum(String idNum){ 
		myIdNum = idNum; 
	} 
	public void setGPA(double gpa){ 
		myGPA = gpa; 
	} 
	// overrides the toString method in the parent class 
	@Override
	public String toString(){ 
		return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA; 
	} 
}

public class Teacher extends Person {
	private String subject;
	private double salary;

	public Teacher(String _name, int _age, String _gender, String _subject, double _salary) {
		super(_name, _age, _gender); 
		subject = _subject;
		salary = _salary;
	}

	String getSubject() { return subject; }
	double getSalary() { return salary; }
	void setSubject(String _subject) { subject=_subject; }
	void setSalary(double _salary) { salary=_salary; }
	@Override
	String toString() { return super.toString() + ", salary: " + salary + ", subject: " + subject; }
}

public class HighSchoolStudent extends Student {
	String acadamy;
	int year;
	
	public HighSchoolStudent(String _name, int _age, String _gender, String _idNum, double _gpa, String _acadamy, int _year){
		super(_name, _age, _gender, _idNum, _gpa);
		acadamy=_acadamy;
		year=_year;
	}

	String getAcadamy() { return acadamy; }
	double getYear() { return salary; }
	void setAcadamy(String _acadamy) { acadamy=_acadamy; }
	void setYear(double _year) { year=_year; }
	@Override
	String toString() { return super.toString() + ", acadamy: " + acadamy + ", year: " + year; }
}

public class Freshman extends HighSchoolStudent {
	int fear = 0;
	
	public Freshman(String _name, int _age, String _gender, String _idNum, double _gpa, String _acadamy, int _year, int _fear){
		super(_name, _age, _gender, _idNum, _gpa, _acadamy, _year);
		fear=_fear;
	}

	int getFear(){return fear;}
	void setFear(int _fear){fear=_fear;}
	bool isScared() {return (fear > 4 ? true : false);}
	@Override
	String toString() { return super.toString() + ", fearLevel: " + fear; }
}

public class Senior extends HighSchoolStudent {
	int coolness = 0;
	
	public Senior(String _name, int _age, String _gender, String _idNum, double _gpa, String _acadamy, int _year, int _coolness){
		super(_name, _age, _gender, _idNum, _gpa, _acadamy, _year);
		coolness=_coolness;
	}

	int getCoolness(){return fear;}
	void setCoolness(int _coolness){coolness=_coolness;}
	bool isTuff() {return (coolness > 4 ? true : false);}
	@Override
	String toString() { return super.toString() + ", coolnessLevel: " + coolness; }
}

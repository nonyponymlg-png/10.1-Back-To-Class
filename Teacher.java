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
	public String toString() { return super.toString() + ", salary: " + salary + ", subject: " + subject; }
}
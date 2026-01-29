public class HighSchoolStudent extends Student {
	String acadamy;
	int year;
	
	public HighSchoolStudent(String _name, int _age, String _gender, String _idNum, double _gpa, String _acadamy, int _year){
		super(_name, _age, _gender, _idNum, _gpa);
		acadamy=_acadamy;
		year=_year;
	}

	String getAcadamy() { return acadamy; }
	double getYear() { return year; }
	void setAcadamy(String _acadamy) { acadamy=_acadamy; }
	void setYear(int _year) { year=_year; }
	@Override
	public String toString() { return super.toString() + ", acadamy: " + acadamy + ", year: " + year; }
}
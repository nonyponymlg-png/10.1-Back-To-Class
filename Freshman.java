public class Freshman extends HighSchoolStudent {
	int fear = 0;
	
	public Freshman(String _name, int _age, String _gender, String _idNum, double _gpa, String _acadamy, int _year, int _fear){
		super(_name, _age, _gender, _idNum, _gpa, _acadamy, _year);
		fear=_fear;
	}

	int getFear(){return fear;}
	void setFear(int _fear){fear=_fear;}
	boolean isScared() {return (fear > 4 ? true : false);}
	@Override
	public String toString() { return super.toString() + ", fearLevel: " + fear; }
}
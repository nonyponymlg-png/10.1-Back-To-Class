public class Senior extends HighSchoolStudent {
	int coolness = 0;
	
	public Senior(String _name, int _age, String _gender, String _idNum, double _gpa, String _acadamy, int _year, int _coolness){
		super(_name, _age, _gender, _idNum, _gpa, _acadamy, _year);
		coolness=_coolness;
	}

	int getCoolness(){return coolness;}
	void setCoolness(int _coolness){coolness=_coolness;}
	boolean isTuff() {return (coolness > 4 ? true : false);}
	@Override
	public String toString() { return super.toString() + ", coolnessLevel: " + coolness; }
}
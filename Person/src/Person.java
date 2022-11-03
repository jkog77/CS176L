
public class Person {
	/**
	   A person is represented by the name and a birth year.
	   You must enter the class name, instance variable(s), and constructor below
	*/
	private String name;
	private int birthYear;
	
	public Person(String name1, int birthYear1) {
		name = name1;
		birthYear = birthYear1;
	}

	/**
	      Returns the string representation of the object.
	      @return a string representation of the object
	*/
	   public String toString()
	   {
	      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	   }

}

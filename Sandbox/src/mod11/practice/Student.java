package mod11.practice;

import java.io.Serializable;

/**
 * Class description: This represents a student at a school.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Student implements Serializable {

	static final long serialVersionUID = 2L;

	private int id;
	private String name;
	private double gpa;
	private String stream; // new field added in v2.0
	private double scholarship; // we're ok with the default value, don't need to update the version #

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, double gpa, String stream) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.stream = stream;
	}

	// TO DO : override equals()

	// toString
	@Override
	public String toString() {
		return "  ID: " + this.id + "\nName: " + this.name + "\n GPA: " + this.gpa;
	}

}

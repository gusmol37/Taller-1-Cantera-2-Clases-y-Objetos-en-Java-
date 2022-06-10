package lasClases;

/**
 * Class that allows the handling of methods and objects
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-05-31
 */

public class Son {

	/**
	 * Declaration protected name attribute of type String
	 */
	protected String name;

	/**
	 * Declaration private age attribute of type int
	 */
	int age;

	/**
	 * Declaration protected motherName attribute of type String
	 */
	protected String motherName;

	/**
	 * Declaration protected fatherName attribute of type String
	 */
	protected String fatherName;

	/**
	 * Constructors
	 *
	 * @param name:       son's name
	 * @param age:        son's age
	 * @param motherName: mother's name
	 * @param fatherName: father's name
	 */
	public Son(String name, int age, String motherName, String fatherName) {
		this.name = name;
		this.age = age;
		this.motherName = motherName;
		this.fatherName = fatherName;
	}

	/**
	 * Method that captures son's name.
	 * 
	 * @return returns son's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method that assigns initial value to son's name.
	 * 
	 * @return value son's name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method that captures son's age.
	 * 
	 * @return returns son's age.
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Method that assigns initial value to son's age.
	 * 
	 * @return value son's age.
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Method that captures mother's name.
	 * 
	 * @return returns mother's name.
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * Method that assigns initial value to mother's name.
	 * 
	 * @return value mother's name.
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * Method that captures father's name.
	 * 
	 * @return returns father's name.
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * Method that assigns initial value to father's name.
	 * 
	 * @return value father's name.
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

}
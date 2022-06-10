package lasClases;

/**
 * Class that allows the handling of methods and objects
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 31-05-2022
 */
public class Animal {

	/**
	 * Declaration private attribute name of type String
	 */
	private String name;

	/**
	 * Declaration private attribute race of type String
	 */
	private String race;

	/**
	 * Declaration public attribute weight of type float
	 */
	public float weight;

	/**
	 * Declaration protected owner attribute of type String
	 */
	protected String owner;

	/**
	 * Constructors
	 *
	 * @param name:   the pet's name
	 * @param race:   pet breed
	 * @param weight: pet weight
	 * @param owner:  pet owner
	 */
	public Animal(String name, String race, float weight, String owner) {
		this.name = name;
		this.race = race;
		this.weight = weight;
		this.owner = owner;
	}

	/**
	 * Method that captures the pet's name.
	 * 
	 * @return returns the pet's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method that assigns initial value to the pet's name.
	 * 
	 * @return the the pet's name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method that captures pet breed.
	 * 
	 * @return returns pet breed.
	 */
	public String getRace() {
		return race;
	}

	/**
	 * Method that assigns initial value to the pet's name.
	 * 
	 * @return pet breed
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * Method that captures pet owner.
	 * 
	 * @return returns pet owner.
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * Method that assigns initial value to pet owner.
	 * 
	 * @return pet breed
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
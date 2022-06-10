package lasClases;

/**
 * Class that allows the handling of methods and objects
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 31-05-2022
 */

/**
* Import java.util.ArrayList
*/
import java.util.ArrayList;

/**
 * Creating the Fruit class
 */
public class Fruit {

	/**
	 * Declaration public attribute name of type String
	 */
	public String name;

	/**
	 * Declaration private averageWeight attribute of type float
	 */
	private float averageWeight;

	/**
	 * Declaration of ArrayList named colors
	 */
	public ArrayList<String> colors = new ArrayList();

	/**
	 * Constructors
	 *
	 * @param name
	 * @param averageWeight
	 */
	public Fruit(String name, float averageWeight) {
		this.name = name;
		this.averageWeight = averageWeight;
	}

	/**
	 * Method that assigns initial value to attribute name.
	 * 
	 * @return name
	 */
	public void setColors(String name) {
		this.name = name;
	}

	/**
	 * Method that captures value to attribute name.
	 * 
	 * @return returns Account Number.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method that assigns initial value to attribute name.
	 * 
	 * @return name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method that captures value to attribute averageWeight.
	 * 
	 * @return returns averageWeight.
	 */
	public float getAverageWeight() {
		return averageWeight;
	}

	/**
	 * Method that assigns initial value to attribute averageWeight.
	 * 
	 * @return returns averageWeight.
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}

	/**
	 * Method that captures value to attribute getColors.
	 * 
	 * @return returns getColors.
	 */
	public ArrayList<String> getColors() {
		return colors;
	}

	/**
	 * Method that assigns initial value to attribute colors.
	 * 
	 * @return returns colors.
	 */
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}

}
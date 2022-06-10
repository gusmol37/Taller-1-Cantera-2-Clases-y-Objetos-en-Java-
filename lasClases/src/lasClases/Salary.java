package lasClases;

/**
 * Class that allows the handling of methods and objects
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 31-05-2022
 */

/**
 * Create the Salary class
 */
public class Salary {

	/**
	 * Declaration attribute private nameWorker of type String
	 */
	private String nameWorker;

	/**
	 * Declaration private hour attribute of type int
	 */
	private int hour;

	/**
	 * Declaration of private value attribute of type float
	 */
	private float value;

	/**
	 * Declaration protected total attribute of type float
	 */
	protected float total;

	/**
	 * Constructors
	 *
	 * @param nameWorker
	 * @param hour
	 * @param value
	 * @param total
	 */
	public Salary(String nameWorker, int hour, float value) {
		this.nameWorker = nameWorker;
		this.hour = hour;
		this.value = value;

	}

	/**
	 * Method that captures the worker's name.
	 * 
	 * @return returns the worker's name.
	 */
	public String getNameWorker() {
		return nameWorker;
	}

	/**
	 * Method that assigns initial value to the worker's name.
	 * 
	 * @return value to the worker's name
	 */
	public void setNameWorker(String nameWorker) {
		this.nameWorker = nameWorker;
	}

	/**
	 * Method that captures hour.
	 * 
	 * @return returns hour.
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Method that assigns initial value to the hour.
	 * 
	 * @return value to the worker's hour
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * Method that captures hour value.
	 * 
	 * @return returns hour value.
	 */
	public float getValue() {
		return value;
	}

	/**
	 * Method that assigns initial to hour value.
	 * 
	 * @return value to hour value
	 */
	public void setValue(float value) {
		this.value = value;
	}

	/**
	 * Method that captures total value.
	 * 
	 * @return returns total value.
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * Method that assigns initial to total value.
	 * 
	 * @return value to total value
	 */
	public void setTotal(float total) {
		this.total = total;
	}

	public float valorTotal(int hour, float value) {
		return (hour * value);
	}
}

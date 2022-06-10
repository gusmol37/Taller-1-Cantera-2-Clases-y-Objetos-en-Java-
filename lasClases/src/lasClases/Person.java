package lasClases;

/**
 * Class that allows the handling of methods and objects
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 31-05-2022
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Person class
 */
public class Person {

    /**
     * Declaration public attribute name of type String
     */
    public String name;

    /**
     * Declaration public attribute lastName1 of type String
     */
    public String lastName1;

    /**
     * Declaration public attribute lastName2 of type String
     */
    public String lastName2;

    /**
     * Public attribute declaration dateBirth of type Date
     */
    public Date dateBirth;

    /**
     * Declaration public attribute height of type float
     */
    public float height;

    /**
     * Constructor
     *
     * @param name
     * @param lastName1
     * @param lastName2
     * @param height
     */
    public Person(String name, String lastName1, String lastName2, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.height = height;
    }

    /**
	 * Method that assigns initial value to person큦 name.
	 * 
	 * @return value to person큦 name
	 */    
    public void setName(String name) {
        this.name = name;
    }

    /**
	 * Method that captures person큦 name.
	 * 
	 * @return returns pet person큦 name.
	 */
    public String getName() {
        return name;
    }

    /**
	 * Method that assigns initial value to person큦 first lastname.
	 * 
	 * @return value to person큦 first lastname
	 */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
	 * Method that captures person큦 first lastname.
	 * 
	 * @return returns pet person큦 first lastname.
	 */
    public String getLastName1() {
        return lastName1;
    }

    /**
	 * Method that assigns initial value to person큦 second lastname.
	 * 
	 * @return value to person큦 second lastname
	 */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
	 * Method that captures person큦 second lastname.
	 * 
	 * @return returns pet person큦 second lastname.
	 */
    public String getLastName2() {
        return lastName2;
    }

    /**
	 * Method that assigns initial value to dateBirth.
	 * 
	 * @return value to dateBirth
	 */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
	 * Method that captures person  birth date.
	 * 
	 * @return returns pet person birth date.
	 */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
	 * Method that assigns initial value to height.
	 * 
	 * @return value to height
	 */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
	 * Method that captures person height.
	 * 
	 * @return returns pet person height.
	 */
    public float getHeight() {
        return height;
    }

    /**
	 * Method that establishes the date data format.
	 * 
	 * @return returns date data format.
	 */
    public String formatDateBirth() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String formatDateBirth1 = sdf.format(dateBirth);
       return formatDateBirth1;
     }
}
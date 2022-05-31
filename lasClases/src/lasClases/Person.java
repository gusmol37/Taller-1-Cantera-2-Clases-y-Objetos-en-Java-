package lasClases;

/**
 * 
 * @author Gustavo Molina
 *
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
     * Creation of Getters and Setters Methods.
     * 
    /**
     * Create setName method to set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Create getName method to get name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Create setLastName1 method to set LastName1
     *
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Create getLastName method to get LastName1
     *
     * @return lastName1
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Create setLastName2 method to set lastName2
     *
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Create method getLastName2 to get lastName2
     *
     * @return lastName2
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Create setDateBirth method to set dateBirth
     *
     * @param dateBirth
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Create getDateBirth method to get dateBirth
     *
     * @return dateBirth
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Create the setHeight method to set height
     *
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Create getHeight method to get height
     *
     * @return height
     */
    public float getHeight() {
        return height;
    }

    public String formatDateBirth() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String formatDateBirth1 = sdf.format(dateBirth);
       return formatDateBirth1;
     }
}
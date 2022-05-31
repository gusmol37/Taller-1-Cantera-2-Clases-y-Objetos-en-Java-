package lasClases;

/**
 * 
 * @author Gustavo Molina
 *
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
    * Creat setColors method to set name of Color
    *
    * @param name
    */
   public void setColors(String name) {
       this.name = name;
   }

   /**
    * Create getName method to get name of the fruit
    *
    * @return name
    */
   public String getName() {
       return name;
   }

   /**
    * Create setName method to set the name of the fruit
    *
    * @param name
    */
   public void setName(String name) {
       this.name = name;
   }

   /**
    * Create method getAverageWeight to get averageWeight
    *
    * @return
    */
   public float getAverageWeight() {
       return averageWeight;
   }

   /**
    * Create method setAverageWeight 
    *
    * @param averageWeight
    */
   public void setAverageWeight(float averageWeight) {
       this.averageWeight = averageWeight;
   }

   /**
    * Create getColor method using ArrayList
    *
    * @return colors
    */
   public ArrayList<String> getColors() {
       return colors;
   }

   /**
    * Create setColors method using ArrayList
    *
    * @param colors
    */
   public void setColors(ArrayList<String> colors) {
       this.colors = colors;
   }

}
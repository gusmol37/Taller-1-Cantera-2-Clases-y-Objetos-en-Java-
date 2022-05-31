package lasClases;

/**
*
* @author Tatiana Marcela Cediel
*/

/**
* Creation of the Animal class
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
    * Constructores
    *
    * @param name
    * @param race
    * @param weight
    * @param owner
    */
   public Animal(String name, String race, float weight, String owner) {
       this.name = name;
       this.race = race;
       this.weight = weight;
       this.owner = owner;
   }

   /**
    * Creating getters and setters of private and protected variables
    * 
    */
   /**
    * Create the getName method
    *
    * @return name
    */
   public String getName() {
       return name;
   }

   /**
    * Create the setName method
    *
    * @param name
    */
   public void setName(String name) {
       this.name = name;
   }

   /**
    * Create the getRace method
    *
    * @return race
    */
   public String getRace() {
       return race;
   }

   /**
    * Create the setRace method
    *
    * @param race
    */
   public void setRace(String race) {
       this.race = race;
   }

   /**
    * Creación del método getOwner
    *
    * @return owner
    */
   public String getOwner() {
       return owner;
   }

   /**
    * Create the getOwner method
    *
    * @param owner
    */
   public void setOwner(String owner) {
       this.owner = owner;
   }

}
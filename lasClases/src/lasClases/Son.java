package lasClases;

/**
 * 
 * @author Gustavo Molina
 *
 */
	/**
	* Create the Son class
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
    * @param name
    * @param age
    * @param motherName
    * @param fatherName
    */
   public Son(String name, int age, String motherName, String fatherName) {
       this.name = name;
       this.age = age;
       this.motherName = motherName;
       this.fatherName = fatherName;
   }

   /**
    * Create getName method
    *
    * @return name
    */
   public String getName() {
       return name;
   }

   /**
    * Create setName method
    *
    * @param name
    */
   public void setName(String name) {
       this.name = name;
   }

   /**
    * Create getAfe method
    *
    * @return age
    */
   public int getAge() {
       return age;
   }

   /**
    * Create setAge method
    *
    * @param age
    */
   public void setAge(int age) {
       this.age = age;
   }

   /**
    * Create getMotherName method
    *
    * @return motherName
    */
   public String getMotherName() {
       return motherName;
   }

   /**
    * Create setMotherName method
    *
    * @param motherName
    */
   public void setMotherName(String motherName) {
       this.motherName = motherName;
   }

   /**
    * Create getFatherName method
    *
    * @return fatherNName
    */
   public String getFatherName() {
       return fatherName;
   }

   /**
    * Create the setFatherName method
    *
    * @param fatherName
    */
   public void setFatherName(String fatherName) {
       this.fatherName = fatherName;
   }

}
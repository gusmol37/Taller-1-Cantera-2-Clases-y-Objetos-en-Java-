package lasClases;

/**
 * 
 * @author Gustavo Molina
 *
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
    * Create getNameWorker method
    *
    * @return nameWorker
    */
   public String getNameWorker() {
       return nameWorker;
   }

   /**
    * Create setNameWorker method
    *
    * @param nameWorker
    */
   public void setNameWorker(String nameWorker) {
       this.nameWorker = nameWorker;
   }

   /**
    * Create getHour method
    *
    * @return hour
    */
   public int getHour() {
       return hour;
   }

   /**
    * Create setHour method
    *
    * @param hour
    */
   public void setHour(int hour) {
       this.hour = hour;
   }

   /**
    * Create getValue method
    *
    * @return value
    */
   public float getValue() {
       return value;
   }

   /**
    * Create setValue method
    *
    * @param value
    */
   public void setValue(float value) {
       this.value = value;
   }

   /**
    * Create getTotal method
    *
    * @return total
    */
   public float getTotal() {
       return total;
   }

   /**
    * Create setTotal method
    *
    * @param total
    */
   public void setTotal(float total) {
       this.total = total;
   }

   public float valorTotal(int hour,float value){
   return (hour*value);
}
}

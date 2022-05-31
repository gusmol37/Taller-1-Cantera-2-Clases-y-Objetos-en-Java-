package lasClases;

/**
 * 
 * @author Gustavo Molina
 *
 */
/**
* Create the BankAccount class
*/
public class BankAccount {

   /**
    * Declaration attribute private accountNumer of type int
    */
   private int accountNumber;

   /**
    * Declaration protected activated attribute of type boolean
    */
   protected boolean activated;

   /**
    * Constructors
    *
    * @param accountNumber
    * @param activated
    */
   public BankAccount(int accountNumber, boolean activated) {
       this.accountNumber = accountNumber;
       this.activated = activated;
   }

   /**
    * Create the getAccountNumber method
    *
    * @return accountNumber
    */
   public int getAccountNumber() {
       return accountNumber;
   }

   /**
    * Create the setAccountNumber method
    *
    * @param accountNumber
    */
   public void setAccountNumber(int accountNumber) {
       this.accountNumber = accountNumber;
   }

   /**
    * Create the isActivated method
    *
    * @return activated
    */
   public boolean isActivated() {
       return activated;
   }

   /**
    * Create the setActivated method
    *
    * @param activated
    */
   public void setActivated(boolean activated) {
       this.activated = activated;
   }

}

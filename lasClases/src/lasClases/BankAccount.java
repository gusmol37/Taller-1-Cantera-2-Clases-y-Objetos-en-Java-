package lasClases;

/**
 * Class that allows the handling of methods and objects
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 31-05-2022
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
	 * Method that captures Account Number.
	 * 
	 * @return returns Account Number.
	 */
   public int getAccountNumber() {
       return accountNumber;
   }

   /**
	 * Method that assigns initial value to Account Number.
	 * 
	 * @return Account Number
	 */
   public void setAccountNumber(int accountNumber) {
       this.accountNumber = accountNumber;
   }

   /**
	 * Method that captures Account Status.
	 * 
	 * @return Account Status boolean values.
	 */
   public boolean isActivated() {
       return activated;
   }

   /**
	 * Method that assigns initial value to Account Status.
	 * 
	 * @return Account Status boolean values
	 */
   public void setActivated(boolean activated) {
       this.activated = activated;
   }

}

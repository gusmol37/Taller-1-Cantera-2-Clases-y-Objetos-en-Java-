package lasClases;

/**
 * Main class of the application which allows the handling of classes and objects
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-05-31
 */

public class Main {

	public static void main(String[] args) {
		/**
		 * AttributeDeclaration animal: represents an animal // bankAccount: represents a
		 * person's bank account // fruit: represents a fruit // person: represents an
		 * individual // salary: represents the salary that a person has for their work //
		 * son: represents an individual related to his parents
		 */
		Animal animal;
		BankAccount bankAccount;
		Fruit fruit;
		Person person;
		Salary salary;
		Son son;

		/**
		 * Create object of class Animal. It shows the data of the attributes of the
		 * Animal class: pet name, breed, age, owner.
		 */
		animal = new Animal("Kelly", "Puddle", 16, "Gustavo");

		/**
		 * Create BankAccount class object It shows the data of the attributes of the
		 * BankAccount class: account number such as and status
		 */
		bankAccount = new BankAccount(121212, true);

		/**
		 * Fruit class object creation It shows the data of the attributes of the Fruit
		 * class: fruit name and weight.
		 * 
		 */
		fruit = new Fruit("Lulo", 6);

		/**
		 * Create object of class Person It shows the data of the attributes of the
		 * Person class: name, first lastname, second lastname, age.
		 */
		person = new Person("Gustavo", "Molina", "Batista", 50);

		/**
		 * Create Salary class object It shows the data of the attributes of the Salary
		 * class: name of the worker, hours worked, total value.
		 */
		salary = new Salary("Alejandro", 10, 65500);

		/**
		 * Creation of object of class Son It shows the data of the attributes of the
		 * Son class: child's name, age, mother's name, father's name.
		 */
		son = new Son("Gustavo Alejandro Molina", 9, "Diomira Forero", "Gustavo Molina");

		/**
		 * Data printing Class data printing method
		 */
		System.out.println("Animal Class:");
		System.out.println("The name of the pet is: " + animal.getName() + ", your race is: " + animal.getRace()
				+ ", your weight is: " + animal.weight + ", its owner is: " + animal.getOwner() + "\n");

		System.out.println("BankAccount Class:");
		System.out.println("The account number is: " + bankAccount.getAccountNumber() + ", your status is: "
				+ bankAccount.isActivated() + "\n");

		System.out.println("Fruit Class:");
		System.out.println("The name of the fruit is: " + fruit.getName() + ", the average weight is: "
				+ fruit.getAverageWeight() + ", its color is: " + fruit.getColors() + "\n");

		System.out.println("Person Class:");
		System.out.println("Name: " + person.name + ", last name: " + person.getLastName1() + ", second last name: "
				+ person.getLastName2() + ", weight: " + person.getHeight() + "\n");

		System.out.println("Salary Class:");
		System.out.println("Employee: " + salary.getNameWorker() + ", worked " + salary.getHour()
				+ " hours, each worth: " + salary.getValue() + ", for a total salary of: "
				+ salary.valorTotal(salary.getHour(), salary.getValue()) + "\n");

		System.out.println("Son Class:");
		System.out.println("Name: " + son.getName() + ", age: " + son.getAge() + " years, mother's name: "
				+ son.getMotherName() + ", father's name: " + son.getFatherName());

	}
}
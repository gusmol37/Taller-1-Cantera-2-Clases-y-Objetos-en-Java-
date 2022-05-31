package lasClases;

/**
 * 
 * @author Gustavo Molina
 *
 */

public class Main {

    public static void main(String[] args) {
        /**
         * Attribute Declaration
         */
        Animal animal;
        BankAccount bankAccount;
        Fruit fruit;
        Person person;
        Salary salary;
        Son son;

        /**
         * Create object of class Animal
         */
        animal = new Animal("Kelly", "Puddle", 16, "Gustavo");
        
        /**
         * Create BankAccount class object
         */
        bankAccount = new BankAccount(121212, true);
        
        /**
         * Fruit class object creation
         */
        fruit = new Fruit("Lulo", 6);

        /**
         * Create object of class Person
         */
        person = new Person("Gustavo", "Molina", "Batista", 50);
        
        /**
         * Create Salary class object
         */
        salary = new Salary("Alejandro", 10, 65500);
        
        /**
         * Creation of object of class Son
         */
        son = new Son("Gustavo Alejandro Molina", 9, "Diomira Forero", "Gustavo Molina");

        /**
         * Data printing
         */
        System.out.println("Animal Class:");
        System.out.println("The name of the pet is: " + animal.getName() + ", your race is: " + animal.getRace() + ", your weight is: "
                + animal.weight + ", its owner is: " + animal.getOwner() + "\n");

        System.out.println("BankAccount Class:");
        System.out.println("The account number is: " + bankAccount.getAccountNumber() + ", your status is: " + bankAccount.isActivated() + "\n");

        System.out.println("Fruit Class:");
        System.out.println("The name of the fruit is: " + fruit.getName() + ", the average weight is: " + fruit.getAverageWeight()
                + ", its color is: " + fruit.getColors()+ "\n");

        System.out.println("Person Class:");
        System.out.println("Name: " + person.name + ", last name: "+person.getLastName1() + ", second last name: "+ person.getLastName2() + ", weight: "+  person.getHeight() + "\n");

        System.out.println("Salary Class:");
        System.out.println("Employee: " + salary.getNameWorker() + ", worked " + salary.getHour() + " hours, each worth: "
                + salary.getValue() + ", for a total salary of: " + salary.valorTotal(salary.getHour(), salary.getValue()) + "\n");

        System.out.println("Son Class:");
        System.out.println("Name: " + son.getName() + ", age: " + son.getAge() + " years, mother's name: " + son.getMotherName()
                + ", father's name: " + son.getFatherName());
    }
}
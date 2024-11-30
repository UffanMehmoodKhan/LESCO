package Database;

import java.awt.desktop.SystemSleepEvent;

public class database {

    public Admin_DB admin;
    public Employee_DB employee;
    public Customer_DB customer;
    public Billing_DB billing;
    public NADRA_DB nadra;
    public Tax_DB tax;

    public database(){
        //Constructor

    }

    public void initializeDB(){
        System.out.println("Initializing Databases...\n");

        //admin = new Admin_DB();
        employee = new Employee_DB();
        customer = new Customer_DB();
        billing = new Billing_DB();
        nadra = new NADRA_DB();
        tax = new Tax_DB();
    }

    public void deinitializeDB(){
        System.out.println("De-initializing Databases...\n");
        //admin.deinitializeDB();
        employee.deinitializeDB();
        customer.deinitializeDB();
        billing.deinitializeDB();
        nadra.deinitializeDB();
        tax.deinitializeDB();

    }

    public void closeDB(){
        System.out.println("Closing Databases...\n");
        // Write all current data onto each respect
        // ive database
    }

}



package App;

import Session.*;
import Database.*;


public class App {

    public static void main(String[] args) throws InterruptedException {

        if(args.length != 1) {
            System.out.println("\nUsage: java App -user_type\n");
            return;
        }
        for (String arg : args) {
            System.out.println(arg);
        }

        String user = args[0];
        //Session session;

        database mainDBManager = new database();
        mainDBManager.initializeDB();

        switch (user) {
            //case "-a" -> new Admin(mainDBManager);
            case "-e" -> new Employee(mainDBManager);
            case "-c" -> new Customer(mainDBManager);
        }

        System.out.println("Session Closed");
        mainDBManager.deinitializeDB();

    }
}
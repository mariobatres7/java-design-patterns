package edu.guatejug.singleton.example;

/**
 *
 * @author Mario Batres
 */
public class DatabaseSingletonDoubleCheck {

    private static DatabaseSingletonDoubleCheck databaseSingletonDoubleCheck = null;

    private DatabaseSingletonDoubleCheck() {
    }

    public static DatabaseSingletonDoubleCheck getInstance() {

        if (databaseSingletonDoubleCheck == null) {

            synchronized (DatabaseSingletonDoubleCheck.class) {
                if (databaseSingletonDoubleCheck == null) {
                    databaseSingletonDoubleCheck = new DatabaseSingletonDoubleCheck();
                }
            }
        }
        return databaseSingletonDoubleCheck;
    }

    public void createQuery(String sqlString) {
        System.out.println("DatabaseSingletonDoubleCheck:  Creando query:  " + sqlString);
    }

}

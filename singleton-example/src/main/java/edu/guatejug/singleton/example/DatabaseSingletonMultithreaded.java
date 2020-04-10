package edu.guatejug.singleton.example;

/**
 *
 * @author Mario Batres
 */
public class DatabaseSingletonMultithreaded {

    private static DatabaseSingletonMultithreaded databaseSingletonMultithreaded = null;

    private DatabaseSingletonMultithreaded() {
    }

    public static synchronized DatabaseSingletonMultithreaded getInstance() {

        if (databaseSingletonMultithreaded == null) {
            databaseSingletonMultithreaded = new DatabaseSingletonMultithreaded();
        }
        return databaseSingletonMultithreaded;
    }

    public static void createQuery(String sqlString) {
        System.out.println("DatabaseSingletonMultithreaded:  Creando query:  " + sqlString);
    }
}

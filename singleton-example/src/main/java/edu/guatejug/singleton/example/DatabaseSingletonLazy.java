package edu.guatejug.singleton.example;

/**
 * Resuelve el problema de el objeto innecesario en memoria pero puede fallar en
 * entornos multihilos.
 *
 * @author Mario Batres
 */
public class DatabaseSingletonLazy {

    private static DatabaseSingletonLazy databaseSingletonLazy = null;

    private DatabaseSingletonLazy() {
    }

    public static DatabaseSingletonLazy getInstance() {

        if (databaseSingletonLazy == null) {
            databaseSingletonLazy = new DatabaseSingletonLazy();
        }
        return databaseSingletonLazy;
    }
    
    
    public static void createQuery(String sqlString) {
        System.out.println("DatabaseSingletonLazy:  Creando query:  " + sqlString);
    }

}

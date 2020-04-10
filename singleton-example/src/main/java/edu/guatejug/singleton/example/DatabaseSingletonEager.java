package edu.guatejug.singleton.example;

/**
 * El objeto será creado cuando la clase sea cargada por la JVM, podría ser un
 * objeto no utilizado que tenga asignado un segmento de memoria.
 *
 * @author Mario Batres
 */
public class DatabaseSingletonEager {

    private static DatabaseSingletonEager databaseSingletonEager = new DatabaseSingletonEager();

    private DatabaseSingletonEager() {
    }

    public static DatabaseSingletonEager getInstance() {
        return databaseSingletonEager;
    }

    
    public static void createQuery(String sqlString) {
        System.out.println("DatabaseSingletonEager:  Creando query:  " + sqlString);
    }
}

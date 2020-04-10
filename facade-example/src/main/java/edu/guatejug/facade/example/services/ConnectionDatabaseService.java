package edu.guatejug.facade.example.services;

/**
 *
 * @author Mario Batres
 */
public class ConnectionDatabaseService {

    public void connectDatabase() {
        System.out.println("Creando conexión a base de datos");
    }

    public void closeDatabase() {
        System.out.println("Cerrando conexión a base de datos");
    }
}

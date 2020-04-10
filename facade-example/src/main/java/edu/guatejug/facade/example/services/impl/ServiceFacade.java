package edu.guatejug.facade.example.services.impl;

import edu.guatejug.facade.example.services.ConnectionDatabaseService;

/**
 *
 * @author Mario Batres
 */
public class ServiceFacade {

    //Un conjunto de servicios
    private final MailService mailService;
    private final ConnectionDatabaseService connectionDatabaseService;

    public ServiceFacade() {
        this.mailService = new MailService();
        this.connectionDatabaseService = new ConnectionDatabaseService();
    }

    public void start() {
        this.mailService.initMailService();
        this.connectionDatabaseService.connectDatabase();
        
        System.out.println("Servicio nuevo creado ... ");
    }

    public void finish() {

        this.mailService.finishMailService();
        this.connectionDatabaseService.closeDatabase();

    }
}

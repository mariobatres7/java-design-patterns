package edu.guatejug.factory.method.example.product;

import edu.guatejug.factory.method.example.Document;

/**
 *
 * @author Mario Batres
 */
public class TicketDocument implements Document {

    @Override
    public String getName() {
        return "Ticket";
    }

}

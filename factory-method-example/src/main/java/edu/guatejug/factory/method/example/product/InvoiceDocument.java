package edu.guatejug.factory.method.example.product;

import edu.guatejug.factory.method.example.Document;

/**
 *
 * @author Mario Batres
 */
public class InvoiceDocument implements Document {

    @Override
    public String getName() {
        return "Factura";
    }

}

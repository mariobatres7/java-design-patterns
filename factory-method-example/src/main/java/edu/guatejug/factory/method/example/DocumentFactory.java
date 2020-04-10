package edu.guatejug.factory.method.example;

import edu.guatejug.factory.method.example.product.InvoiceDocument;
import edu.guatejug.factory.method.example.product.TicketDocument;

/**
 *
 * @author Mario Batres
 */
public abstract class DocumentFactory {

    public enum DocumentType {
        INVOICE, TICKET;
    }

    public static Document createDocument(DocumentType documentType) {
        switch (documentType) {
            case INVOICE:
                return new InvoiceDocument();

            case TICKET:
                return new TicketDocument();
        }

        return null;
    }
}

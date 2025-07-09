package org.example.A10.TD1.service;

public class RealDocumentService implements DocumentService {
    @Override
    public void displayDocument(String docId) {
        System.out.println("📄 Affichage du document : " + docId);
    }
}

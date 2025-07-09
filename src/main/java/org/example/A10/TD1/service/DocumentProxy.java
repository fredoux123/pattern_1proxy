package org.example.A10.TD1.service;

import org.example.A10.TD1.model.Document;
import org.example.A10.TD1.model.User;

import java.util.HashMap;
import java.util.Map;

public class DocumentProxy implements DocumentService {
    private RealDocumentService realService = new RealDocumentService();
    private User currentUser;

    private static Map<String, Document> docDB = new HashMap<>();

    static {
        docDB.put("public123", new Document("public123", "Contenu public", true));
        docDB.put("secret456", new Document("secret456", "Contenu confidentiel", false));
    }

    public DocumentProxy(User user) {
        this.currentUser = user;
    }

    @Override
    public void displayDocument(String docId) {
        Document doc = docDB.get(docId);
        if (doc == null) {
            System.out.println("❓ Document introuvable.");
            return;
        }

        System.out.println("🔐 Vérification des droits d'accès pour " + currentUser);

        if (doc.isPublic() || currentUser.isAdmin()) {
            System.out.println("📄 " + doc.getContent());
            System.out.println("📝 Log : " + currentUser.getUsername() + " a consulté " + docId);
        } else {
            System.out.println("⛔ Accès refusé à " + docId);
        }
    }
}
